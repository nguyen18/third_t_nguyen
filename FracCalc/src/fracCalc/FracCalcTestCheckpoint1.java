package fracCalc;

import java.util.*;
import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1
{
	public static void main(String[] args) {
		Scanner scans = new Scanner(System.in);
		System.out.println("please input your equation (ex: 1/2 + 1/2)");
		String equation = scans.nextLine();
		System.out.println(produceAnswer(equation));
	}
	
	public static String produceAnswer(String equation) {
		String[] separatedOperands = equation.split(" ");
		String operand2 = separatedOperands[2];
		
		return operand2;
		
	}
   
}