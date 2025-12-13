package arrays;

import java.util.Arrays;

public class MInMaxSequenceInSortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        minMaxSequenceGenerator(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void  minMaxSequenceGenerator(int arr[]){
        int maxIndex=arr.length-1;
        int minIndex=0;
        int max=arr[maxIndex]+1;
        for(int i=0;i<arr.length;i++) {
            if (i % 2 != 0) {
                arr[i] = arr[i] + (arr[maxIndex] % max) * max;
                maxIndex--;
            } else {
                arr[i] = arr[i] + (arr[minIndex] % max) * max;
                minIndex++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/max;
        }
    }
}
