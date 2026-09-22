package mathematics;

public class NumberUtilities {
    static void main(String[] args) {
        System.out.println(reversedNumber(432));
    }
    static int reversedNumber(int number){
        int reversedNumber=0;
        while(number!=0){
            reversedNumber=reversedNumber*10+(number%10);
            number=number/10;
        }
        return reversedNumber;

    }
}
