package textExcel;
import java.util.*;
// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] sheet;
	
	public Spreadsheet() {
		sheet = new Cell[20][12];
		for(int row = 0; row < 20; row++) {
			for(int col = 0; col < 12; col++) {
				sheet[row][col] = new EmptyCell();
			}
		}
	}

	@Override
	public String processCommand(String input)
	{
		if(input.equals("")) {
			return "";
		}
		
		String[] command = input.split(" ", 3);
		String cell = command[0].toUpperCase();
		
		if(command[0].toLowerCase().equals("clear")) {
			clearCell(command);
			return getGridText();
		}
		
		else if(command.length > 2) {
			setCell(command);
			return getGridText();
		}
		else {
			SpreadsheetLocation inspect = new SpreadsheetLocation(command[0].toUpperCase());
			return getCell(inspect).fullCellText();
		}
		
	}
	
	public void setCell(String[] input) {
		SpreadsheetLocation placeholder = new SpreadsheetLocation(input[0].toUpperCase());
		if (input.length > 1){ //if a text cell, take the string between the quotes and fill the array element with a text cell
			String words = input[2].substring(1, (input[2].length())-1);
			sheet [placeholder.getRow()] [placeholder.getCol()] = new TextCell(words);
		}
	}
	
	public void clearCell(String[] input) {
		if (input.length > 1){ //if "clear" all
			SpreadsheetLocation placeholder = new SpreadsheetLocation(input[1].toUpperCase());
			sheet[placeholder.getRow()][placeholder.getCol()] = new EmptyCell (); //make everything an empty cell
		}
		else {
			for(int row = 0; row < 20; row++) {
				for(int col = 0; col < 12; col++) {
					sheet[row][col] = new EmptyCell();
			}
			}
		}
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
		String grid;
		grid = "   |";
		for(char col = 'A'; col <= 'L'; col++) {
			
			grid += col + "         |";
		}
		
		grid += '\n';
	int side =1;
		for(int row = 0; row < 20; row++) {
			if( side < 10 ) {
				grid += side + "  |";
			}
			else {
				grid += side + " |";
			}
			side = side+1;
			for(int col = 0; col < 12; col++) {
				
				grid += sheet[row][col].abbreviatedCellText() + "|";
			}
			grid += '\n';
		}
		
		return grid;
	}
	

}


