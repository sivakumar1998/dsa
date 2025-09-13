package arrays;

import java.util.Arrays;

public class ReturnAllExceptFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
int result[]=returnAllExceptFirstLast(arr);
System.out.println(Arrays.toString(result));
	}

	public static int[] returnAllExceptFirstLast(int arr[]) {

		int result[];
		if (arr.length <= 2) {
			return new int[] {};
		} else {
			result = new int[arr.length - 2];
			for (int i = 1; i < arr.length - 1; i++) {
				result[i - 1] = arr[i];
			}

		}
		return result;
	}
}
