package arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
    int[] array1={1,2,3,4};
    int[] array2={-1,5,6};
    int[] mergedArray=mergeSortedArrays(array1,array2);
        System.out.println(Arrays.toString(mergedArray));
    }
    public static int[] mergeSortedArrays(int array1[],int[] array2){
        int[]  mergedArray=new int[array1.length+array2.length];
        int m=array1.length;
        int n=array2.length;
        int l=mergedArray.length;
        int i=0,j=0,k=0;
        while(i<m &&j<n){
            if(array1[i]<array2[j]){
                mergedArray[k]=array1[i];
                i++;
            }
            else{
                mergedArray[k]=array2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mergedArray[k]=array1[i];
            i++;
            k++;
        }
        while (j<n){
            mergedArray[k]=array2[j];
            j++;
            k++;
        }
        return  mergedArray;
    }
}
