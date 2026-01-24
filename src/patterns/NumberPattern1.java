package patterns;

public class NumberPattern1 {
    public static void main(String[] args) {
printNumberPattern1(4);
    }
    public static void printNumberPattern1(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
