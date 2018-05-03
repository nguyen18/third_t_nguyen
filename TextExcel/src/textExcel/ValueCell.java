package textExcel;

public class ValueCell extends RealCell implements  Cell{
	
	public ValueCell(String text) {
		super(text);
	}
	
	public String fullCellText() {
		return super.fullCellText();
	}
	
	public String abbreviatedCellText() {
		return super.abbreviatedCellText();
	}
	
	public double getDoubleValue() {
		return super.getDoubleValue();
	}

}
