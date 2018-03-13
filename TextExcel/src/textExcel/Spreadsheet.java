package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return 0;
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
