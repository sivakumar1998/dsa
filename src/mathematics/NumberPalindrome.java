package mathematics;

import java.util.HashMap;

public class NumberPalindrome {
    static void main(String[] args) {
        System.out.println(isNumberPalindrome(121));
    }
    static boolean isNumberPalindrome(int number){
       return NumberUtilities.reversedNumber(number)==number;
    }
}
