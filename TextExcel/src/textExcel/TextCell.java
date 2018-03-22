package textExcel;

public class TextCell {
	private String text;
	
	public TextCell(String text) {
		this.text = text;
	}
	public String fullTextCell() {
		
		return "\"" + text + "\"";
	}
	
	public String abbreviatedTextCell() {
		int lastQuote = text.lastIndexOf("\"");
		return text.substring(1, lastQuote);
	}
}
