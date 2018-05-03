package textExcel;

public class TextCell extends RealCell implements Cell{
	
	public TextCell(String text) {
		super(text);
	}
	public String fullCellText() {
		return "\"" + super.fullCellText() + "\"";
	}
	
	public String abbreviatedCellText() {
		String spaces = "          ";
		String editedText = super.fullCellText() + spaces;
		return editedText.substring(0,10);
	}
}
