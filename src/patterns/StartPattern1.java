package patterns;

public class StartPattern1 {
    public static void main(String[] args) {
    printStartsPattern1(5);
    }
    public static void  printStartsPattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
