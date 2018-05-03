package textExcel;
import java.util.*;
// Update this file with your own code.
//Taylor Nguyen
//AP Compsci 1st period
public class Spreadsheet implements Grid
{
	private Cell[][] sheet;
	
	public Spreadsheet() { //creates empty spreadsheet
		sheet = new RealCell[20][12];
		for(int row = 0; row < 20; row++) {
			for(int col = 0; col < 12; col++) {
				sheet[row][col] = new EmptyCell();
			}
		}
	}
	
	public Spreadsheet(Cell[][] textexcel) { //creates spreadsheet from passed in spreadsheet
		sheet = new Cell[20][12];
		for(int row = 0; row < 20; row++) {
			for(int col = 0; col < 12; col++) {
				sheet[row][col] = textexcel[row][col];
			}
		}
	}

	@Override
	public String processCommand(String input) //tests command
	{
		if(input.equals("")) {
			return ""; //returns empty string if empty command
		} 
		
		String[] command = input.split(" ", 3); //splits input string at 3 spaces if possible
		
		if(command[0].toLowerCase().equals("clear")) {
			clearCell(command); //clears spreadsheet
		}
		
		else if(command.length > 2) { //tests if there is a cell
			setCell(command); //sets cell if there is a cell
		}
		else if (input.length() <= 3){ //cell inspection
			SpreadsheetLocation inspect = new SpreadsheetLocation(command[0].toUpperCase());
			return getCell(inspect).fullCellText();
			
		} 
		return getGridText(); //returns whole grid (with command result)
	}
	
	private void setCell(String[] input) {
		String testing = input[2].toUpperCase(); //test index to tell which input fits which cell
		SpreadsheetLocation placeholder = new SpreadsheetLocation(input[0].toUpperCase());
		if (testing.indexOf("\"") == 0){
			String words = input[2].substring(1, (input[2].length())-1);
			sheet [placeholder.getRow()] [placeholder.getCol()] = new TextCell(words); //new text cell if there is quotes
		}
		
		else if(testing.substring(testing.length()-1).equals("%")) {
			sheet [placeholder.getRow()] [placeholder.getCol()] = new PercentCell(testing); //new percent cell if there is a %
		}
		
		else if(testing.substring(testing.length()-1).equals(")")) {
			sheet [placeholder.getRow()] [placeholder.getCol()] = new FormulaCell(input[2], this); //new formula cell if there is a (
		}
		
		else {
			sheet [placeholder.getRow()] [placeholder.getCol()] = new ValueCell(testing); //new value cell if none of the above is applicable
		}

	}
	
	private void clearCell(String[] input) {
		if (input.length > 1){  //clears individual cell
			SpreadsheetLocation placeholder = new SpreadsheetLocation(input[1].toUpperCase());
			sheet[placeholder.getRow()][placeholder.getCol()] = new EmptyCell (); //make everything an empty cell
		}
		else {
			for(int row = 0; row < 20; row++) { //clears whole grid
				for(int col = 0; col < 12; col++) {
					sheet[row][col] = new EmptyCell();
			}
			}
		}
	}

	@Override
	public int getRows()
	{
		return 20; //returns number of rows
	}

	@Override
	public int getCols()
	{
		return 12; //returns number of cols
	}

	@Override
	public Cell getCell(Location loc)
	{
		return sheet[loc.getRow()][loc.getCol()]; //get reference to value in cell name
	}

	@Override
	public String getGridText() //prints grid
	{
		String grid;
		grid = "   |";
		for(char col = 'A'; col <= 'L'; col++) { //top (prints col letters)
			
			grid += col + "         |";
		}
		
		grid += '\n';
	int side =1;
		for(int row = 0; row < 20; row++) {
			if( side < 10 ) {
				grid += side + "  |"; //prints row numbers
			}
			else {
				grid += side + " |";
			}
			side = side+1;
			for(int col = 0; col < 12; col++) {
				
				grid += sheet[row][col].abbreviatedCellText() + "|"; //prints value of cells
			}
			grid += '\n';
		}
		
		return grid; //returns entire grid in one string
	}
	

}


