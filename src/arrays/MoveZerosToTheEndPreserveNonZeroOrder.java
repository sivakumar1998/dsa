package arrays;

import java.util.Arrays;

public class MoveZerosToTheEndPreserveNonZeroOrder {
    public static void main(String[] args) {
        int[] arr = {-1,-3,0, 0, 1, 2, 3};
        moveZerosToEndOfTheArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToEndOfTheArray(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }


}
