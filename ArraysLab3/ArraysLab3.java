import java.util.Arrays;

//Taylor Nguyen
//AP Compsci 1st period

public class ArraysLab3 {
	
	public static void main(String[] args) {
		 int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		 int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		 int[] sumArr = sum(a1, a2);
		 int appendNum = 200;
		 int[] appendArr = append(a1, appendNum);
		 int removeIdx = 5;
		 int[] removeArr = remove(a2, removeIdx);
		 int sumOfEvens = sumEven(appendArr);
		 rotateRight(a1);
		 
		 System.out.println("sum: "+ Arrays.toString(sumArr));
		 System.out.println("append: " + Arrays.toString(appendArr));
		 System.out.println("remove: " + Arrays.toString(removeArr));
		 System.out.println("even sum: " + sumOfEvens);
		 System.out.println("rotate right: " + Arrays.toString(a1));
	}
	
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			int sumOfIndex = arr1[i] + arr2[i];
			newArr[i] = sumOfIndex;
		}
		return newArr;
	}
	
	public static int[] append(int[] arr, int num) {
		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length-1] = num;
		return newArr;
	}
	
	public static int[] remove(int[] arr, int idx) {
		int[] newArr = new int[arr.length - 1];
		int arrIndex = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[arrIndex] != idx) {
				newArr[i] = arr[arrIndex];
			} else if(arr[arrIndex] == idx){
				newArr[i] = arr[arrIndex + 1];
				arrIndex++;
			}
			arrIndex++;
		}
		return newArr;
	}
	
	public static int sumEven(int[] arr) {
		int evenSum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenSum += arr[i];
			}
		}
		return evenSum;
	}
	
	public static void rotateRight(int[] arr) {
		int tempNum = arr[arr.length-1];
		for(int i = arr.length-1; i >= 1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = tempNum;
	}
}
