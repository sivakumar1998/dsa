package arrays;

import java.util.Arrays;

public class MoveZerosToTheBeginingPreserveNonZeroOrder {
    public static void main(String[] args) {
    int arr[]={1,2,0,3,4,5};
    moveZerosToBegining(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZerosToBegining(int[] arr) {
        int j = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j--;
            }
        }
    }
}
