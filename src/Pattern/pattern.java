package Pattern;

public class pattern {
    public static void main(String[] args) {
        pattern5(4);

    }
    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            int num =0;
            for (int j=0; j<=i; j++) {
                num++;
                System.out.print(" "+num);
            }
            System.out.println(" ");
        }
    }
    public static void pattern2(int n){
        for (int row = 0; row<n*2; row++) {
            if(row>n) {
                for (int i = 0; i < 2*n-row; i++) {
                    System.out.print("*");
                }
            }
            else {
            for (int colum = 0; colum < row; colum++) {
                System.out.print("*");
            }}
            System.out.println(" ");

        }

    }
    public static void pattern3(int n){
        for (int row = 0; row<n*2; row++) {
            int totalColum= row>n?2*n-row:row;
            int noOfSpace=n-totalColum;

            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }
                for (int i = 0; i < totalColum; i++) {
                    System.out.print("* ");
            }

            System.out.println();

        }

    }
    public static void pattern4(int n){
        for (int row = 1; row<=n; row++) {

            for (int s = 0; s < n-row; s++) {
                System.out.print(" ");
            }
            for (int i=row; i>=1; i--) {
                System.out.print(i);
            }
            for (int i=2; i<=row; i++) {
                System.out.print(i);
            }

            System.out.println();

        }

    }
    public static void pattern5(int n){
        for (int row = 1; row<=n*2; row++) {
            int c = row>n?n*2-row:row;
            int s = row>n?row-n:n-row;
            for (int space = 0; space<s; space++) {
                System.out.print(" ");
            }
            for (int i=c; i>=1; i--) {
                System.out.print(i);
            }
            for (int i=2; i<=c; i++) {
                System.out.print(i);
            }

            System.out.println();

        }

    }


}

