package textExcel;

public class RealCell implements Cell{
	private String text;
	
		public RealCell(String text) {
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
		
		public double getDoubleValue() {
			return Double.parseDouble(text);
		}
	
}
