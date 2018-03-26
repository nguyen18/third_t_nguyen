package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] sheet;
	private TextCell cell;
	private SpreadsheetLocation loc;
	private String grid;
	
	public Spreadsheet() {
		sheet = new Cell[20][12];
		for(int row = 1; row < sheet.length; row++) {
			for(int col = 1; col < sheet[0].length; col++) {
				sheet[row][col] = 
			}
		}
	}

	@Override
	public String processCommand(String command)
	{
		command = command.toUpperCase();
		cell = new TextCell(command);
		
		if(command.indexOf(command) > 0) {
			return cell.fullTextCell();
		}
		if(command.indexOf("=") > 0) {
			return cell.abbreviatedTextCell();
		}
		
		if(command.indexOf("clear") >= 0) {
			return getGridText();
		}
		
		if(command.equals("clear " + command)) {
			return getGridText();
		}
		
		
		return "";
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
	
		for(int row = 1; row <= 20; row++) {
			if( row < 10 ) {
				grid += row + "  |";
			}
			else {
				grid += row + " |";
			}
			for(int space = 1; space <= 12; space++) {
				grid += sheet[row][space];
			}
			grid += '\n';
		}
		
		return grid;
	}
	

}


