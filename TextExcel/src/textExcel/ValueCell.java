package textExcel;

public class ValueCell extends RealCell{
	private String words;
	
	public ValueCell(String text) {
		super(text);
		words = text;
	}
	
	public String fullCellText() {
		if (words.indexOf(".")<0){
			return words;
		}
		return getValue(words)+"";
	}
	
	public String abbreviatedCellText() {
		String spaces = "          ";
		String editedText = getValue(words) + spaces;
		return editedText.substring(0,10);
	}
	
	public double getValue(String words) {
		return super.getDoubleValue(words);
	}

}
