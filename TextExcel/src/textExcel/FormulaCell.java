package textExcel;

public class FormulaCell extends RealCell implements Cell{
	private String formula;
	private Cell[][] sheet;
	
	public FormulaCell(String text, Cell[][] sheet) {
		super(text);
		formula = text;
		this.sheet = sheet;
	}
	
	public String fullCellText() {
		return formula;
	}
	
	public String abbreviatedCellText() {
		String spaces = "          ";
		String editedText = getDoubleValue() + spaces;
		return editedText.substring(0,10);
	}
	
	public double value(double num1, double num2, String operand) {
		if(operand.equals("*")) {
			return num1 * num2;
		}
		
		if(operand.equals("/")) {
			return num1 / num2;
		}
		
		if(operand.equals("+")) {
			return num1 + num2;
		}
		
		if(operand.equals("-")) {
			return num1 - num2;
		}
		return 0.0;
		
	}
	
	public boolean yesCell(String cell) {
		if(Character.isLetter(cell.charAt(0)) && Character.isDigit(cell.charAt(1))) {
			return true;
		}
		return false;
	}
	
	public double getDoubleValue() {
		String[] separateOperands = formula.split(" ");
		
		if(separateOperands.length == 3) {
			return Double.parseDouble(separateOperands[1]);
		}
		
		if(separateOperands[1].equals("SUM")) {
			
		}
		for(int i = 0; i < separateOperands.length; i++) {
			if(yesCell(separateOperands[i]) == true) {
				SpreadsheetLocation loc = new SpreadsheetLocation(separateOperands[i].toUpperCase());
				separateOperands[i] = (sheet [loc.getRow()] [loc.getCol()]).fullCellText();
			}
		}

		
		Double num1 = Double.parseDouble(separateOperands[1]);
		Double num2 = Double.parseDouble(separateOperands[3]);
		String operand = separateOperands[2];
		Double value = value(num1, num2, operand);
		
		for(int i = 4; i < separateOperands.length-1; i=i+2) {
			operand = separateOperands[i];
			num2 = Double.parseDouble(separateOperands[i+1]);
			value = value(value, num2, operand);
	
		}

		return value;
	}
}
