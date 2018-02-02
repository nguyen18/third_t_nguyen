//TAYLOR NGUYEN
//AP COMPSCI PERIOD 1
//FINAL FRACCALC
package fracCalc;

import java.util.Scanner;

public class FracCalc {
	private int whole;
	private int denom;
	private int num;
	private String wholeAsString;
	private String denomAsString;
	private String numAsString;
	
	private int whole2;
	private int denom2;
	private int num2;
	private String wholeAsString2;
	private String denomAsString2;
	private String numAsString2;
	
	
	public void toMixedNumbers() {
		
	}
	
	public void toImproper() {
		
	}
	
	public int toInt(String input) {

		
	}
	
	public String simplify(String answer) {
		String[] answerSplit = answer.split("/");
		int answerTop = Integer.parseInt(answerSplit[0]);
		int answerBot = Integer.parseInt(answerSplit[1]);
		
		if(answerTop < 0 && answerBot < 0) {
			answerTop = answerTop * -1;
			answerBot = answerBot * -1;
		}
		
		if(answerTop > 0 && answerBot < 0) {
			answerTop = answerTop * -1;
			answerBot = answerBot * -1;
		}
		if( answerTop < 0 && answerBot > 0) {

			
		}
		
		int wholeNumAns = answerTop / answerBot;
		int gcf = gcf(answerTop, answerBot);
		
		if (answerTop > 1 && answerBot > 1) {
		answer = wholeNumAns + "_" + ((answerTop % answerBot) / gcf) + "/" + (answerBot / gcf);
		}
		
		if(answerBot > answerTop && answerBot > 1 && answerTop > 0) {
			answer = ((answerTop % answerBot) / gcf) + "/" + (answerBot / gcf);
		}
		
		if(answerTop % answerBot == 0 || answerTop == answerBot) {
			answer = wholeNumAns + "";
		}
	
		
		if(answerTop < 0 && answerBot > 1) {
			if(answerTop % answerBot != 0) {
				answer = wholeNumAns + "_" + (((-1*answerTop) % answerBot) / gcf) + "/" + (answerBot / gcf);
			}
			if(answerTop % answerBot == 0) {
				answer = wholeNumAns +"";
			}
			
			if(wholeNumAns == 0) {
				answer = (((answerTop) % answerBot) / gcf) + "/" + (answerBot / gcf);
			}
		}

		
		if(answerBot == 1) {
			answer = answerTop +"";
		}
		
		if(answerBot == -1) {
			answerTop = -1 *answerTop;
			answer = answerTop + "";
		}
		
		if(answerTop == 0) {
			answer = "0";
		}
		
		return answer;
	}
	
	public void toString() {
		
	} 
    
}
