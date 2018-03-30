package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

import textExcel.TestsALL.TestLocation;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean done = false;
		Grid test = new Spreadsheet();
		String hello = "hello";
//		TestsALL.Helper th = new TestsALL.Helper();
//		System.out.println(th.getText());
		String greeting = "Hello, world!";
		test.processCommand("L20 = \"" + greeting + "\"");
		System.out.print(test.processCommand("L20"));
//      Cell greetingCell = test.getCell(new TestLocation(19,11));
//
//      System.out.print(greetingCell.fullCellText());
//		System.out.print(test.processCommand("A1"));
//		System.out.print(test.processCommand("A1 = \"first\""));
//		System.out.print(test.processCommand(""));
//		System.out.print(test.getGridText());
		
//	    do {
//	    	//quit loop
//	    	System.out.println("Are you finished inputting values? if yes, type 'quit'. if no, type 'no'");
//	    	String finished = input.nextLine();
//
//	    		while (!finished.equals("quit") && !finished.equals("no")) {
//	    		System.out.println("error. please type quit or no");
//	    		finished = input.nextLine();
//	    	}
//	    	if(finished.equals("quit")) {
//	    		done = true;
//	    	}
//	    	else if (finished.equals("no")) {
//	    		done = false;
//	    	}
//	    
//	    } while (!done);
//	    System.out.println("Thank you!");
	}
}
