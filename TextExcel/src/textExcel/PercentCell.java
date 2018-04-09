package textExcel;

public class PercentCell extends RealCell{
	private String percent;
	public PercentCell(String text) {
		super(text);
		percent = text;
	}
	public String fullCellText() {
		return (getValue(percent) / 100)+"";
	}
	
	public String abbreviatedCellText() {
		String abrv = "";
		if (percent.indexOf(".")>0){
			abrv = percent.substring(0, percent.indexOf(".")); //checking if there is a decimal in the percentage, and truncates the decimal
		}
		abrv += "%         ";
		return abrv.substring(0,10);
	}
	
	public double getValue(String percent) {
		return super.getDoubleValue(percent.substring(0, percent.length()-1));
	}
}
