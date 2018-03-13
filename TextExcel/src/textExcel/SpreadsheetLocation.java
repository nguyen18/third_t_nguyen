package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int getRows = 0;
    	private int getCols = 0;
    	
    public SpreadsheetLocation(String cellName)
    {
    		
    		String collumn = "ABCDEFGHIJKL";
    		int[] rows = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    		String[][] spreadsheet = new String[20][12];
    		for(int r = 0; r < rows.length; r++) {
    			for(int c = 0; c < collumn.length(); c++) {
    				spreadsheet[r][c] = "" + collumn.charAt(c) + (rows[r]);
    				if(spreadsheet[r][c].equals(cellName)) {
    					getRows = r;
    					getCols = c;
    				}
    			}
    		}
    		
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
