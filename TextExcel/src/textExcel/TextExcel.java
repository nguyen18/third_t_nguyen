package textExcel;
//Taylor Nguyen
//AP Compsci 1st period
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.Scanner;

import textExcel.TestsALL.Helper;
import textExcel.TestsALL.TestLocation;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean done = false;

	    do {
	    	//quit loop
	    	System.out.println("Are you finished inputting values? if yes, type 'quit'. if no, type 'no'");
	    	String finished = input.nextLine();

	    		while (!finished.equals("quit") && !finished.equals("no")) {
	    		System.out.println("error. please type quit or no");
	    		finished = input.nextLine();
	    	}
	    	if(finished.equals("quit")) {
	    		done = true;
	    	}
	    	else if (finished.equals("no")) {
	    		done = false;
	    	}
	    
	    } while (!done);
	    System.out.println("Thank you!");
	}
}
