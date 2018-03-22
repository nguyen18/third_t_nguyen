package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] sheet;
	private SpreadsheetLocation loc;
	private String grid;
	public Spreadsheet() {
		
	}

	@Override
	public String processCommand(String command)
	{
		if(command.equals("getRows")) {
			getRows();
		}
		8888
		if(command.equals("getCols")) {
			getCols();
		}
		
		if(command.equals("")) {
			return "";
		}
		
		if(command.equals("SpreadsheetLocation row")) {
			return "" + loc.getRow();
		}
		
		if(command.equals("SpreadsheetLocation collumn")) {
			return "" + loc.getCol();
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
		
	}

}
