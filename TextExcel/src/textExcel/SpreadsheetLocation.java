package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int rows;
   	private int cols;
    	
    public SpreadsheetLocation(String cellName)
    {
    		rows = Integer.parseInt(cellName.substring(1));
    		cols = cellName.charAt(0);
    		
    }

    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return rows-1;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return cols-'A';
    }
    


}
