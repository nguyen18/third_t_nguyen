package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean done = false;
		Cell[][] testing = new Cell[20][12];
		Spreadsheet test = new Spreadsheet(testing);
		
	    do {
	    	System.out.println("please input a command");
	    	String command = input.nextLine();
	    String result =	test.processCommand(command);
	    System.out.println(result);
	    	System.out.println("Are you finished inputting values? if yes, type 'quit'. if no, type 'no'");
	    	String finished = input.nextLine();
	    	if(finished.equals("quit")) {
	    		done = true;
	    	}
	    	else if (finished.equals("no")) {
	    		done = false;
	    	}
	    	else while (!finished.equals("quit") && !finished.equals("no")) {
	    		System.out.println("error. please type yes or no");
	    		finished = input.nextLine();
	    	}
	    } while (!done);
	}
}
