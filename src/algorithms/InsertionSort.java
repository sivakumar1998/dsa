package algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
int arr[]={1,9,0,8,6,-1};
sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            // a=[4,1,2,3]
            int j= i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
               arr[j]=key;
               j=j-1;
            }
        }
    }
}
