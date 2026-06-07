package Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        pattern13(5);
    }

    public static void pattern13(int n){
        for(int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row ; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void pattern(int n){
        // for 1st half
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j=n-i;j <n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <=n; i++) {

            for (int j=1;j<=i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
