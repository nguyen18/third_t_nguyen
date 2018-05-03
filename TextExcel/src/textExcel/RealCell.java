package textExcel;

public class RealCell implements Cell{
	private String text;
	
		public RealCell(String text) {
			this.text = text;
		}
		
		public String fullCellText() {
			return  text; //returns full text
		}
		
		public String abbreviatedCellText() {
			return (getDoubleValue() + "          ").substring(0, 10); //fits display
		}
		
		public double getDoubleValue() {
			return Double.parseDouble(text); //converts text from string to double
		}
	
}
