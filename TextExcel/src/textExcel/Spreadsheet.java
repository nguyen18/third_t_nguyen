package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	Cell[][] sheet;
	public Spreadsheet() {
		
	}

	@Override
	public String processCommand(String command)
	{
//		if(command.equals("getRows")) {
//			getRows();
//		}
//		
//		if(command.equals("getCols")) {
//			getCols();
//		}
//		
//		if(command.equals("")) {
//			return "";
//		}
//		
//		if(command.equals("SpreadsheetLocation row")) {
//			return "" + getRows();
//		}
//		
//		if(command.equals("SpreadsheetLocation collumn")) {
//			return "" + getCols();
//		}
		
		
		return "";
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
		return sheet[loc.getRow()][loc.getCol()];
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
