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
		System.out.println(strMain);
		//no change in value when changing the value in the method except for array
	

	}
	public static void changeMe(int x, String str, int[] arr) {
		//2)
		int b = x;
		x = 4;
		System.out.println("b:" + b);
				//prints 7
				
		String bb = str;
		str = "sup";
		System.out.println("b:" + bb);
		//prints APCS
		
		int[] newArr = arr;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+2;
		}
		System.out.println("arr:" + Arrays.toString(newArr));
		//prints [2, 3, 4, 5, 6] --> yes changes values
		
		//1)
		//can't change values of parameters, because if you input variables from above in first method, comes outs as error
		//if you change void, just changes what method returns
		double num = (double) x;
		//doesn't return a number with a different primitive type
		x = 8;
		//does change array values
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		str = "hello";
		//can't cast String to be a different type
		
		
	}

}
