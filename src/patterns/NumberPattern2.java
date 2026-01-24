package patterns;

public class NumberPattern2 {
    public static void main(String[] args) {
        printNumberPatter2(4);
    }
    public static void printNumberPatter2(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
