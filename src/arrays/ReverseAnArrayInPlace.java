package arrays;

import java.util.Arrays;

public class ReverseAnArrayInPlace {
    public static void main(String[] args) {
int[] array={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
        reverseTheArray(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void reverseTheArray(int[] array,int startIndex,int endIndex){
        while(startIndex<endIndex){
            int temp=array[startIndex];
            array[startIndex]=array[endIndex];
            array[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
}
