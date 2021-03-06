package textExcel;
//Taylor Nguyen
//AP Compsci 1st period
public class FormulaCell extends RealCell implements Cell{
	private Spreadsheet sheet;
	private String orig;
	
	public FormulaCell(String text, Spreadsheet sheet) {
		super(text.toUpperCase()); //keeps upppercase for other stuff
		this.sheet = sheet;
		this.orig = text; //keeps orig text to pass test
	}
	
	public String fullCellText() {
		return orig; //return orig text
	}
	
	public String abbreviatedCellText() {
		return (getDoubleValue() + "          ").substring(0, 10); //fits display
	}

	public double value(double num1, double num2, String operand) {
		//solves algebra
		if(operand.equals("*")) {
			return num1 * num2;
		}
		
		if(operand.equals("/")) {
			return num1 / num2;
		}
		
		if(operand.equals("+")) {
			return num1 + num2;
		}
		
		if (operand.equals("-")) {
			return num1 - num2;
		}
		return 0.0;
	}
	
	public boolean yesCell(String cell) {
		//tests for cell names
		if(Character.isLetter(cell.charAt(0)) && Character.isDigit(cell.charAt(1))) {
			return true;
		}
		return false;
	}
	
	public double avg(String cellNames) {
		String[] cells = cellNames.split("-"); //splits the cell range so we can get individual cell names for start and end range
		String[] letter1split = cells[0].split(" "); 
		char letter1 = letter1split[2].charAt(0);
		char letter2 = cells[1].charAt(0);
		int num1 = Integer.parseInt(letter1split[2].substring(1));
		int num2 = Integer.parseInt(cells[1].substring(1, cells[1].indexOf(" ")));
		double sum = 0;
		int divisor = 0;
		
		for(char letter = letter1; letter <= letter2; letter++) {
			for(int num = num1; num <= num2; num++) {
				SpreadsheetLocation loc = new SpreadsheetLocation(letter +""+num);
				sum += ((RealCell)sheet.getCell(loc)).getDoubleValue();
				divisor ++;
			} //adds values of each cell in the range and adds to number of divisors
		}
			
		return sum / divisor; //return avg

	}

	public double sum(String cellNames) {
		String[] cells = cellNames.split("-"); //splits range to get start and end cell names
		String[] letter1split = cells[0].split(" ");
		char letter1 = letter1split[2].charAt(0);
		char letter2 = cells[1].charAt(0);
		int num1 = Integer.parseInt(letter1split[2].substring(1));
		int num2 = Integer.parseInt(cells[1].substring(1, cells[1].indexOf(" ")));
		double sum = 0.0;
		
		for(char letter = letter1; letter <= letter2; letter++) {
			for(int num = num1; num <= num2; num++) {
				SpreadsheetLocation loc = new SpreadsheetLocation(letter +""+num);
				sum += ((RealCell)sheet.getCell(loc)).getDoubleValue();
			} //add value of each cell in range
		}
		
		return sum; //return sum of cells in the range
	
	}
	
	public double getDoubleValue() {
		String[] separateOperands = super.fullCellText().split(" "); //separates formula
		
		//finds value for individual cell names
		for(int i = 0; i < separateOperands.length && !(super.fullCellText().indexOf("AVG") > 0 || super.fullCellText().indexOf("SUM") > 0); i++) {
			if(yesCell(separateOperands[i]) == true) {
				SpreadsheetLocation loc = new SpreadsheetLocation(separateOperands[i].toUpperCase());
				separateOperands[i] = ((RealCell) sheet.getCell(loc)).getDoubleValue() +"";
			} 
		}
		
		String operand = "";
		double num1 = 0.0;
		double num2 = 0.0;
		
		if(super.fullCellText().toUpperCase().indexOf("AVG") > -1) { //tests for command avg
			return avg(super.fullCellText());
		}
		if(super.fullCellText().toUpperCase().indexOf("SUM") > -1) { //tests for command sum
			return sum(super.fullCellText());
		}
		
		num1 = Double.parseDouble(separateOperands[1]);
		Double value = num1;
		
		for(int i = 2; i < separateOperands.length-1; i=i+2) {
			operand = separateOperands[i];
			if(!(separateOperands[i+1].equals(""))) {
			num2 = Double.parseDouble(separateOperands[i+1]);
			} else {
				num2 = 0.0;
			}
			value = value(value, num2, operand); //does algebra of formula inputted
	
		}
		return value; //return result of formula
		
	}

}
