package patterns;

public class StarPattern3 {
    public static void main(String[] args) {
printInvertedStart(4);
    }
    public static void printInvertedStart(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
