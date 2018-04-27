package textExcel;

public class PercentCell extends RealCell{

	public PercentCell(String text) {
		super(text);
	}
	public String fullCellText() {
		return (getDoubleValue() / 100)+"";
	}
	
	public String abbreviatedCellText() {
		String abrv = "";
		if (super.fullCellText().indexOf(".")>0){
			abrv = super.fullCellText().substring(0, super.fullCellText().indexOf(".")); //checking if there is a decimal in the percentage, and truncates the decimal
		}
		abrv += "%         ";
		return abrv.substring(0,10);
	}
	
	public double getDoubleValue() {
		return super.getDoubleValue();
	}
}
