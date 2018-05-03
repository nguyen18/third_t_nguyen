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
        Helper helper = new Helper();
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                String cellId = "" + (char)('A' + j) + (i + 1);
                grid.processCommand(cellId + " = " + (i * j));
                helper.setItem(i, j, (i * j) + ".0");
            }
        }
        String first = grid.processCommand("G8 = ( sum A1-E4 )");
        helper.setItem(7, 6, "60.0");
        assertEquals("grid with sum", helper.getText(), first);
        String second = grid.processCommand("G9 = ( avg A1-E4 )");
        helper.setItem(8, 6, "3.0");
        assertEquals("grid with sum and avg", helper.getText(), second);
        String updated = grid.processCommand("E4 = ( sum A4-D4 )");
        helper.setItem(3, 4, "18.0");
        helper.setItem(7, 6, "66.0");
        helper.setItem(8, 6, "3.3");
        assertEquals("updated grid", helper.getText(), updated);
// 
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
