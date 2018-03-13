package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int getRows = 0;
   	private int getCols = 0;
    	
    public SpreadsheetLocation(String cellName)
    {
    	getRows = Integer.parseInt(cellName) -1;
    	getCols = Character.toUpperCase(cellName.charAt(0))-'A';
    		
    }

    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return getRows;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return getCols;
    }
    


}
