package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] sheet;
	private TextCell cell;
	private String grid;
	
	public Spreadsheet() {
		sheet = new Cell[20][12];
		for(int row = 0; row < 20; row++) {
			for(int col = 0; col < 12; col++) {
				sheet[row][col] = new EmptyCell();
			}
		}
	}

	@Override
	public String processCommand(String input)
	{
		input = input.toLowerCase();
		String[] command = input.split(" ",3);
		
		if(input.equals("")) {
			return getGridText();
		}
		
		if(command[0].equals("empty")) {
			command[0] = "clear";
		}
		
		if(command[0].equals("clear")) {
			clearCell(input);
			return getGridText();
		}
		
		else if(input.length() > 2) {
			setCell(command);
			return getGridText();
		}
		else {
			SpreadsheetLocation inspect = new SpreadsheetLocation(command[0]);
			return getCell(inspect).fullCellText();
		}
	}
	
	public void setCell(String[] input) {
		String value = input[2];
		SpreadsheetLocation loc = new SpreadsheetLocation(input[0]);
		sheet[loc.getRow()][loc.getCol()] = new TextCell(value);
	}
	
	public void clearCell(String input) {
		String cellName = input.substring(input.indexOf("clear") + 6);
		if(!(cellName.length() <1)) {
			SpreadsheetLocation loc = new SpreadsheetLocation(cellName);
			sheet[loc.getRow()][loc.getCol()] = new EmptyCell();
		}
		else {
			for(int row = 0; row < 20; row++) {
				for(int col = 0; col < 12; col++) {
					sheet[row][col] = new EmptyCell();
		}
			}
		}
	}

	@Override
	public int getRows()
	{
		return 20;
	}

	@Override
	public int getCols()
	{
		return 12;
	}

	@Override
	public Cell getCell(Location loc)
	{
		return sheet[loc.getRow()][loc.getCol()];
	}

	@Override
	public String getGridText()
	{
		
		grid = "   |";
		for(char col = 'A'; col <= 'L'; col++) {
			
			grid += col + "         |";
		}
		
		grid += '\n';
	
		for(int row = 0; row < 20; row++) {
			if( row < 10 ) {
				grid += row + "  |";
			}
			else {
				grid += row + " |";
			}
			for(int space = 0; space < 12; space++) {
				
				grid += sheet[row][space].abbreviatedCellText() + "|";
			}
			grid += '\n';
		}
		
		return grid;
	}
	

}


