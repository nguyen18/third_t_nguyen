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
		int denom;
		int num;
		int wholeNum;
		
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
		
		denom = Integer.parseInt(denominator) + Integer.parseInt(denominator2);
		num = Integer.parseInt(numerator) + Integer.parseInt(numerator2);
		wholeNum = Integer.parseInt(whole) + Integer.parseInt(whole2);
		
		return operand2 + '\n' + "whole: " + wholeNum + '\n' + "numerator: " + num + '\n' + "denominator: " + denom; 
        
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
