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
		String[] operand2Split = operand2.split("_");
		operand2Split = operand2.split("/");
		
		
		return operand2;
        
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
