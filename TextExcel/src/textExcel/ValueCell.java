package textExcel;

public class ValueCell extends RealCell{
	
	private String value;
	
	public ValueCell(String text) {
		super(text);
		value = text;
	}
	
	public String fullCellText() {
		if(value.indexOf(".") <  0) {
			return value;
		}
		return getDoubleValue(value) + "";
	}
	
	public String abbreviatedCellText() {
		String spaces = "          ";
		String editedText = value + spaces;
		return editedText.substring(0,10);
	}
	
	public double getDoubleValue(String value) {
		
	}

}
