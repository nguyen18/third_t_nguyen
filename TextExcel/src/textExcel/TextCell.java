package textExcel;

public class TextCell implements Cell{
	private String text;
	
	public TextCell(String text) {
		this.text = text;
	}
	public String fullCellText() {
		return "\"" + text + "\"";
	}
	
	public String abbreviatedCellText() {
		String spaces = "          ";
		text = text + spaces;
		return text.substring(0,10);
	}
}
