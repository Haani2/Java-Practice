package Condition;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {7,3,1,9},
                {3,4,6,9},
                {6,9,6,6},
                {9,5,8,5}
        };

        int n = matrix.length;
        int PD= 0;
        int SD= 0;
        for (int i = 0; i < n; i++) {
            PD += matrix[i][i];

        }
            for (int j = n - 1; j >= 0; j--) {
                if (j!=n-j-1) {
                    SD += matrix[j][j];
                }
            }

        System.out.println("Primary Diagonal: "+PD);
        System.out.print("Secondary Diagonal: " + SD);
    }
}
