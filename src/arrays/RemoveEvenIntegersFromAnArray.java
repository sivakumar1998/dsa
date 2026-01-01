package arrays;

import java.util.Arrays;

public class RemoveEvenIntegersFromAnArray {
    public static void main(String[] args) {
int[] arr ={1,7,2,3,4,5,6};
        System.out.println(Arrays.toString(removeEvenIntegers(arr)));

    }
    public static  int[] removeEvenIntegers(int[] arr){
       int oddCount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] oddArray=new int[oddCount];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddArray[j]=arr[i];
                j++;
            }
        }
        return  oddArray;
    }
}
