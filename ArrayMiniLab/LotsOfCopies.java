import java.util.Arrays;

//Taylor Nguyen
//AP Compsci 1st period

public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		
		changeMe(num, strMain, arrMain);
		System.out.println(Arrays.toString(arrMain));
		System.out.println(num);
		//no change in value when changing the value in the method
		//b
		int num2 = num;
		num = 4;
		System.out.println(num2);
		//prints 7
	}
	public static void changeMe(int x, String str, int[] arr) {
		//can't change values of parameters, because if you input variables from above in first method, comes outs as error
		//if you change void, just changes what method returns
		double num = (double) x;
		double[] arrNum = new double[arr.length];
		//can't cast String to be something else
		for(int i = 0; i < arr.length; i++) {
			arrNum[i] = arr[i];
		}
	}

}
