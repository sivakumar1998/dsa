package arrays;

public class FindSecondMaximumNumber {
    public static void main(String[] args) {
        System.out.println(secondMax(new int[]{1,2,3,4,2-9}));
    }
    public static int secondMax(int[] arr){
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            }
            else if((firstMax!=secondMax) && (arr[i]>secondMax) ){
                secondMax=arr[i];
            }
        }
        System.out.println(firstMax);
        return secondMax;
    }
}
