//TAYLOR NGUYEN
//AP COMPSCI PERIOD 1
//FINAL FRACCALC
package fracCalc;

import java.util.*;

public class FracCalc {

	//main method is basically the client
    public static void main(String[] args) 
    {
    	boolean done = false;
        // TODO: Read the input from the user and call produceAnswer with an equation
    	System.out.println("Welcome to FracCalc! ^-^");
    	while(!done) {
    		Scanner scans = new Scanner(System.in);
    		System.out.println("please input your equation (ex: 1/2 + 1/2)");
    		String equation = scans.nextLine();
    		System.out.println("Answer: " + produceAnswer(equation));
    		
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
    	String[] separatedInput = input.split(" ");
    int 	operandIndex1 = 0;
    int 	operandIndex2 = 2;
    int operatorIndex = 1;
   
    	Fraction operand1 = new Fraction(separatedInput[operandIndex1]);
    	Fraction operand2 = new Fraction(separatedInput[operandIndex2]);
    	String operator = separatedInput[operatorIndex];
    	
    String answer = calculation(operand1, operand2, operator);
    	
    	
    return answer;
}
    public static String calculation(Fraction frac1, Fraction frac2, String operator) {
    		String result = "";

    		frac1.improperFrac();
    		frac2.improperFrac();
   
    		
    			if(operator.equals("+")) {
    				 result = addition(frac1, frac2);
    			}
    			if(operator.equals("-")) {
    				result = subtraction(frac1, frac2);
    			}
    			if(operator.equals("*")) {
    				result = multiply(frac1, frac2);
    			}
    			if(operator.equals("/")) {
    				result = divide(frac1,frac2);
    			}
    			
    			Fraction answer = new Fraction(result);
    			return answer.simplify();

}

    
    public static String multiply(Fraction frac1, Fraction frac2) {
    	Fraction mul = new Fraction();
    	mul.setNum(frac1.getNum() * frac2.getNum());
    	mul.setDenom(frac1.getDenom() * frac2.getDenom());
    	
    	return mul.toString();
    	
    }
    
    public static String subtraction(Fraction frac1, Fraction frac2) {
    	Fraction sub = new Fraction();
    	   
    	if(frac1.getDenom() == frac2.getDenom()) {
    		sub.setDenom(frac1.getDenom());
    	 	sub.setNum(frac1.getNum() - frac2.getNum());

    	} else {
    		sub.setDenom(frac1.getDenom() * frac2.getDenom());
    		frac1.setNum(frac1.getNum() * frac2.getDenom());
    		frac2.setNum(frac2.getNum() * frac1.getDenom());
    		sub.setNum(frac1.getNum() - frac2.getNum());
    	}
    	return sub.toString();
    	
    }
    
    public static String addition(Fraction frac1, Fraction frac2) {
    	Fraction add = new Fraction();
   
    	if(frac1.getDenom() == frac2.getDenom()) {
    		add.setDenom(frac1.getDenom());
    	 	add.setNum(frac1.getNum() + frac2.getNum());

    	} else {
    		add.setDenom(frac1.getDenom() * frac2.getDenom());
    		frac1.setNum(frac1.getNum() * frac2.getDenom());
    		frac2.setNum(frac2.getNum() * frac1.getDenom());
    		add.setNum(frac1.getNum() + frac2.getNum());
    	}
    	return add.toString();
    	
    }
    
    public static String divide(Fraction frac1, Fraction frac2) {
    	Fraction div = new Fraction();
    	div.setNum(frac1.getNum() * frac2.getDenom());
    	div.setDenom(frac1.getDenom() * frac2.getNum());
    	
    	return div.toString();
    	
    }
	
    
}
