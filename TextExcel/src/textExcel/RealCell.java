package textExcel;

public class RealCell implements Cell{
	private String text;
	
		public RealCell(String text) {
			this.text = text;
		}
		
		public String fullCellText() {
			return  text ;
		}
		
		public String abbreviatedCellText() {
			return "          ";
		}
		
		public double getDoubleValue(String text) {
			return Double.parseDouble(text);
		}
	
}
