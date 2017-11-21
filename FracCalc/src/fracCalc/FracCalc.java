package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
    	boolean done = false;
        // TODO: Read the input from the user and call produceAnswer with an equation
    	while(!done) {
    		Scanner scans = new Scanner(System.in);
    		System.out.println("please input your equation (ex: 1/2 + 1/2)");
    		String equation = scans.nextLine();
    		System.out.println(produceAnswer(equation));
    		
    		System.out.println("are you done? type quit to exit or no to continue");
    		String answer = scans.nextLine();
    		if(answer.equals("no")) {
    			done = false;
    		} else if (answer.equals("quit")) {
    			done = true;
    			System.out.println("see ya!");
    		} 
    		while (!answer.equals("quit") && !answer.equals("no")) {
    		System.out.println("try again. type quit or no"); 
    		answer = scans.nextLine();
    		if(answer.equals("no")) {
    			done = false;
    		} else if (answer.equals("quit")) {
    			done = true;
    		} 
    		}
    	}
    
 
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        
    	String[] separatedOperands = input.split(" ");
		String operand2 = separatedOperands[2];
		String operand1 = separatedOperands[0];
		String denominator;
		String numerator;
		String whole;
		String denominator2;
		String numerator2;
		String whole2;
		String[] operand2Split;
		String[] operand1Split;
		
		if(operand1.indexOf("/") < 0) {
			numerator = "0";
			denominator = "1";
			whole = operand1;
		} else if(operand1.indexOf("_") < 0) {
			operand1Split = operand1.split("/");
			numerator = operand1Split[0];
			denominator = operand1Split[operand1Split.length - 1];
			whole = "0";
		} else {
			whole = operand1.substring(0, operand1.indexOf("_"));
			numerator = operand1.substring(operand1.indexOf("_")+1, operand1.indexOf("/"));
			denominator = operand1.substring(operand1.indexOf("/")+1);
		}
		
		if(operand2.indexOf("/") < 0) {
			numerator2 = "0";
			denominator2 = "1";
			whole2 = operand2;
		} else if(operand2.indexOf("_") < 0) {
			operand2Split = operand2.split("/");
			numerator2 = operand2Split[0];
			denominator2 = operand2Split[operand2Split.length - 1];
			whole2 = "0";
		} else {
			whole2 = operand2.substring(0, operand2.indexOf("_"));
			numerator2 = operand2.substring(operand2.indexOf("_")+1, operand2.indexOf("/"));
			denominator2 = operand2.substring(operand2.indexOf("/")+1);
		}
		
		
		int denom = Integer.parseInt(denominator);
		int num = Integer.parseInt(numerator);
		int wholeNum = Integer.parseInt(whole);
		
		int denom2 = Integer.parseInt(denominator2);
		int num2 = Integer.parseInt(numerator2);
		int wholeNum2 = Integer.parseInt(whole2);
		
		int improperTop = num;
		int improper2Top = num2;
		
		if(wholeNum != 0 ) {
			improperTop = (wholeNum * denom) + num;
		}
		
		if(wholeNum2 != 0) {
			improper2Top = (wholeNum * denom2) + num2;
		}
		
		int commonDenom = denom;
		if(denom != denom2) {
			if(denom != 0 || denom2 != 0) {
			commonDenom = commonDenom(denom, denom2);
			improperTop = improperTop * commonDenom;
			improper2Top = improper2Top * commonDenom;
			} else if(denom == 1 && denom2 != 1) {
				commonDenom = denom2;
				improperTop  
			}
		}
		
		String answer = "";
		if(input.indexOf("+") < 0) {
			answer = addition(improperTop, improper2Top, commonDenom);
			
		}
		
		if(input.indexOf("-") < 0) {
			answer = subtraction(improperTop, improper2Top, commonDenom);
		}
		
		if(input.indexOf("*") > 0) {
			answer = multiply(improperTop, improper2Top, num, num2);
		}
		
		if(input.lastIndexOf("/") == 2) {
			answer = divide(improperTop, num, improper2Top, num2);
		}
		
		
		
		
		return answer; 
        
    }
    
    public static int commonDenom(int denom, int denom2) {
    	return denom * denom2;
    	
    }

    public static String multiply(int num, int num2, int denom, int denom2) {
    	int multiplyTop = num * num2;
    	int multiplyBottom = denom * denom2;
    	String answer = multiplyTop + "/" + multiplyBottom;
    	return answer;
    	
    }
    
    public static String subtraction(int num, int num2, int commonDenom) {
    	int subtract = num + num2;
    	String answer = subtract + "/" + commonDenom;
    	return answer;
    }
    
    public static String addition(int num, int num2, int commonDenom) {
    	int add = num + num2;
    	String answer = add + "/" + commonDenom;
    	return answer;
    }
    
    public static String divide(int num, int denom, int num2, int denom2) {
    	int top = num * denom2;
    	int bottom = denom * num2;
    	String answer = top + "/" + bottom;
    	return answer;
    	
    }
   
    
}
