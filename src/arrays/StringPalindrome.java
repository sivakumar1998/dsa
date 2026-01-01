package arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("car"));
        System.out.println(isPalindrome("bob"));

    }
    public static boolean isPalindrome(String word){
        char[] characters=word.toCharArray();
        int start=0;
        int end=characters.length-1;
        while (start<end){
            if(characters[start]!=characters[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
