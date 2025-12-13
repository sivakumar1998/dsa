package arrays;

import java.util.Arrays;

public class ResizingArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int[] arr2=array;
        resizeArray(array,10);
        System.out.println(Arrays.toString(array));
        ResizingArray ar=new ResizingArray();
        ar.resizeArray2(arr2,10);
        System.out.println(Arrays.toString(arr2));
        modifyLastElement(array);
        System.out.println(Arrays.toString(array));
    }
    public static  void resizeArray(int[] array,int newSize){
        int[] tempArray=new int[newSize];
        for(int i=0;i<array.length;i++){
            tempArray[i]=array[i];
        }
        array=tempArray;
        System.out.println(Arrays.toString(array));
    }
    public   void resizeArray2(int[] array,int newSize){
        int[] tempArray=new int[newSize];
        for(int i=0;i<array.length;i++){
            tempArray[i]=array[i];
        }
        array=tempArray;
        System.out.println(Arrays.toString(array));
    }
    public static void modifyLastElement(int[] array){
        array[array.length-1]=10;

    }
}
