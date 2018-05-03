package textExcel;

public class TextCell extends RealCell implements Cell{
	
	public TextCell(String text) {
		super(text);
	}
	public String fullCellText() {
		return "\"" + super.fullCellText() + "\""; //returns value of text cell with quotes
	}
	
	public String abbreviatedCellText() {
		String spaces = "          ";
		String editedText = super.fullCellText() + spaces; //fits display
		return editedText.substring(0,10);
	}
}
