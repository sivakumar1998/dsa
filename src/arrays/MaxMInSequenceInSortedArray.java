package arrays;

import java.util.Arrays;

public class MaxMInSequenceInSortedArray {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,9};
        maxMinSequenceGenerator(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static void maxMinSequenceGenerator(int[] arr){
        int maxIndex=arr.length-1;
        int minIndex=0;
        int max=arr[maxIndex]+1;
        for(int i=0;i<arr.length;i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + (arr[maxIndex] % max) * max;
                    maxIndex--;
            } else {
                arr[i] = arr[i] + (arr[minIndex] % max) * max;
                minIndex++;
            }
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=arr[i]/max;
        }
    }
}
