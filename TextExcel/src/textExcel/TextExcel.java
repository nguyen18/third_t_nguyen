package textExcel;

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
		Grid grid = new Spreadsheet();
		String hello = "hello";
//		TestsALL.Helper th = new TestsALL.Helper();
//		System.out.println(th.getText());
//		String greeting = "Hello, world!";
        grid.processCommand("A1 = ( 1 + 2 + 3 + 4 )"); // 10, then 9
        grid.processCommand("A2 = ( 1 * 2 * 3 * 4 )"); // 24
        grid.processCommand("B1 = ( Sum a1-a2 )"); // 34, then 33
        grid.processCommand("B2 = ( avG a1-A2 )"); // 17, then 16.5
        grid.processCommand("C1 = ( sum A1-B2 )"); // 85, then 82.5
        grid.processCommand("C2 = ( avg a1-b2 )"); // 21.25, then 20.625
        grid.processCommand("d1 = ( c1 / 5.0 )"); // 17, then 16.5
        grid.processCommand("d2 = ( c2 + 1.75 + a1 )"); // 33, then 31.375
        grid.processCommand("e2 = 18");
        grid.processCommand("d3 = 29");
        grid.processCommand("A20 = ( SUM A1-D2 )"); // 241.25, then 233.5
        grid.processCommand("B20 = ( AVG A1-D2 )"); // 30.15625, then 29.1875
        grid.processCommand("a1 = 9");
        grid.processCommand("B1 = ( Sum a1-a2 )"); // 34, then 33
        grid.processCommand("B2 = ( avG a1-A2 )"); // 17, then 16.5
        grid.processCommand("C1 = ( sum A1-B2 )"); // 85, then 82.5
        grid.processCommand("C2 = ( avg a1-b2 )"); // 21.25, then 20.625
        grid.processCommand("d1 = ( c1 / 5.0 )"); // 17, then 16.5
        grid.processCommand("d2 = ( c2 + 1.75 + a1 )"); // 33, then 31.375
        grid.processCommand("e2 = 18");
        grid.processCommand("d3 = 29");
        grid.processCommand("A20 = ( SUM A1-D2 )"); // 241.25, then 233.5
        grid.processCommand("B20 = ( AVG A1-D2 )");
         System.out.print(grid.processCommand("update"));
//        grid.processCommand("A1 = -9");
//        grid.processCommand("A2 = ( 14 - 7 + -4 - 3 + 3 * A1 )");
//       System.out.print( grid.processCommand("b1 = ( avG A2-a2 )"));
//       
//		String[] cell = "( AVG A15-B15 )".split("-");
//		String[] letter1split = cell[0].split(" ");
//		char letter1 = (letter1split[2].charAt(0));
//		char letter2 = cell[1].charAt(0);
//		System.out.print(letter1 + " " + letter2);
//        grid.processCommand("C3 = 1");
//        grid.processCommand("C4 = ( C3 * 2 )"); // 2
//        grid.processCommand("C5 = ( C4 - C3 )"); // 1
//        grid.processCommand("C6 = ( 32 - C4 )"); // 30
//        System.out.print(grid.processCommand("K20 = ( SUM c3-c6 )")); // 34

//      Cell greetingCell = test.getCell(new TestLocation(19,11));
//
//      System.out.print(greetingCell.fullCellText());
//		System.out.print(test.processCommand("A1"));
//		System.out.print(test.processCommand("A1 = \"8.00222%\""));
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
