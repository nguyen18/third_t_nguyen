package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	public Spreadsheet() {
		
	}
	public Spreadsheet(Cell[][] list) {
		Cell[][] spreadsheetContents = new Cell[20][12];
		for(int row = 1; row <= spreadsheetContents.length; row++ ) {
			for(int col = 1; col <= spreadsheetContents[1].length; col++) {
				spreadsheetContents[row][col] = list [row][col];
			}
		}
	}
	@Override
	public String processCommand(String command)
	{
		if(command.equals("getRows")) {
			getRows();
		}
		
		if(command.equals("getCols")) {
			getCols();
		}
		
		if(command.equals("")) {
			return "";
		}
		
		if(command.equals("SpreadsheetLocation row")) {
			return "" + (getRows() - 1);
		}
		
		if(command.equals("SpreadsheetLocation collumn")) {
			return "" + (getCols() -1);
		}
		
		
		return null;
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
