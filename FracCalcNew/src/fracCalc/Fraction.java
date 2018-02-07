//Taylor Nguyen
//AP Compsci period 1
package fracCalc;

public class Fraction {
	private int whole;
	private int num;
	private int denom;
	
	public Fraction(String frac) {
		parse(frac);
	}
	
	public Fraction() {
		whole = 0;
		num = 0;
		denom = 1;
	}
	
	private void parse(String frac) {
		String[] fracSplit = new String[frac.length()];
		if(frac.indexOf("/") < 0) {
			num = 0;
			denom = 1;
			whole = Integer.parseInt(frac);
		} else if(frac.indexOf("_") < 0) {
			fracSplit = frac.split("/");
			num = Integer.parseInt(fracSplit[0]);
			denom = Integer.parseInt(fracSplit[fracSplit.length - 1]);
			whole = 0;
		} else {
			whole = Integer.parseInt(frac.substring(0, frac.indexOf("_")));
			num = Integer.parseInt(frac.substring(frac.indexOf("_")+1, frac.indexOf("/")));
			denom = Integer.parseInt(frac.substring(frac.indexOf("/")+1));
		}
		
	}
	
	public void improperFrac() {
		if(whole < 0) {
			num = num*-1;
		}
		this.num = (whole * denom) + num;
		this.whole = 1;
		
	}
	
	public int getDenom() {
		return denom;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getWhole() {
		return whole;
	}
	
	public void setDenom (int denom) {
		this.denom = denom;
	}
	
	public void setNum (int num) {
		this.num = num;
	}
	
	public void setWhole (int whole) {
		this.whole = whole;
	}
	
	public String toString() {
		String toString = num + "/" + denom;
		return toString;
	}
	
	public String simplify() {
		String answer = "";

		if(num < 0 && denom < 0) {
			num *= -1;
			denom *= -1;
		}
		if(num == 0 && whole == 0) {
			answer = "0";
		} else {
		
		whole = num / denom;

		if(whole != 0) {
			answer += whole +"";
			if( whole < 0 && num < 0) {
				num *= -1;
			}
			if( whole < 0 && denom < 0) {
				denom *= -1;
			}
		}
		
		this.num = num % denom;
		
		if(num != 0) {

			if(whole != 0) {
				num /= gcf(num, denom);
				denom /= gcf(num, denom);
		answer += "_" + num + "/" + denom;
		
	} else {

		answer += num + "/" + denom;
	}
			
		}
		
		}
		
		return answer;

}
	private int gcf(int num1, int num2) {
		 int smaller = num1 < num2 ? num1 : num2;
	        int gcf = -1;
	        for (int i = smaller; i > 0; --i) {
	            if (num1 % i== 0 && num2 % i == 0) {
	                gcf = i;
	        }
	        }

		return gcf;
		
	}
}