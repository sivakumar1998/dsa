package leetCode.easy;

import java.util.Arrays;

public class RunningSumOf1Array {
    public static void main(String[] args){
    int arr[]={1,2,3,5};
        System.out.println(Arrays.toString(getRunningSumApproach1(arr)));
        System.out.println(Arrays.toString(getRunningSumApproach2(arr)));
    }
    public static int[] getRunningSumApproach1(int arr[]){
        int result[]=new int[arr.length];
        result[0]=arr[0];
        for(int index=1;index<arr.length;index++){
            result[index]=result[index-1]+arr[index];
        }
        return result;
    }
    public static int[] getRunningSumApproach2(int[] arr){
        for(int index=1;index< arr.length;index++){
            arr[index]=arr[index]+arr[index-1];
        }
        return  arr;
    }
}
