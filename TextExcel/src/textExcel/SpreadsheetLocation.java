package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int getRows;
   	private int getCols;
    	
    public SpreadsheetLocation(String cellName)
    {
    	getRows = Integer.parseInt(cellName.substring(1)) -1;
    	getCols = (Character.toUpperCase(cellName.charAt(0)))-'A';
    		
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
