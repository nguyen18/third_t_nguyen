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
		String editedText = text + spaces;
		return editedText.substring(0,10);
	}
}
