package arrays;

public class FIndSecondMinimumNumber {
    public static void main(String[] args) {
        int[] arr={1};
        System.out.println(secondMin(arr));
    }
    public static int secondMin(int[] arr){
        if( arr.length>=2) {
            int firstMin = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < firstMin) {
                    secondMin = firstMin;
                    firstMin = arr[i];
                }
               else if ((arr[i] != firstMin) && (arr[i] < secondMin)) {
                    secondMin = arr[i];
                }
            }
            System.out.println(firstMin);
            return secondMin;
        }else {
            System.out.println("array length is less than 2 not possible to find second minimum number");
        return Integer.MAX_VALUE;
        }
    }
}
