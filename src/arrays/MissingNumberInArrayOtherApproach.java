package arrays;

public class MissingNumberInArrayOtherApproach {
    public static void main(String[] args) {
        int[] array={1,2,3,5};
        System.out.println(getMissingNumber(array));
    }
    public static int getMissingNumber(int[] array){
        int sizePlusOne=array.length+1;
        int expectedSum=(sizePlusOne*(sizePlusOne+1))/2;
        for(int i:array){
            expectedSum-=i;
        }
        return expectedSum;
    }

}
