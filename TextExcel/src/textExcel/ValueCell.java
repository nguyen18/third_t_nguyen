package textExcel;
//Taylor Nguyen
//AP Compsci 1st period
public class ValueCell extends RealCell implements  Cell{
	
	public ValueCell(String text) {
		super(text);
	}
	
	public String fullCellText() {
		return super.fullCellText(); //returns whole text
	}
	
	public String abbreviatedCellText() {
		return super.abbreviatedCellText(); //fits display
	}
	
	public double getDoubleValue() {
		return super.getDoubleValue(); //returns string converted to double if applicable
	}

}
