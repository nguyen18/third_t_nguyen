package textExcel;

public class EmptyCell extends RealCell implements Cell
{
	public EmptyCell() {
		super(""); //sets super.fullCellText() as empty string
	}

	public String abbreviatedCellText() {
		//fits spreadsheet display
		return "          ";
	}
	
	public String fullCellText() {
		return ""; //returns empty string
	}
	
}
