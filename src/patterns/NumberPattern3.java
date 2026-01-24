package patterns;

public class NumberPattern3 {
    public static void main(String[] args) {
printNumberFormatReverse(4);
    }
    public static void printNumberFormatReverse(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
