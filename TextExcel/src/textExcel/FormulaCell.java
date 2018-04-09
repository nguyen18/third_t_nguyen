package textExcel;

public class FormulaCell extends RealCell{
	private String formula;
	
	public FormulaCell(String text) {
		super(text);
		formula = text;
	}
	
	public String fullCellText() {
		return formula;
	}
	
	public String abbreviatedCellText() {
		String spaces = "          ";
		String editedText = ((int)getDoubleValue()) + "%" + spaces;
		return editedText.substring(0,10);
	}
	
	public double getDoubleValue() {
		return getDoubleValue();
	}
}
