package BinarySearch;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,8));

    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        // all Edge cases
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            if (target <= matrix[row][cols - 1]) {

                int start = 0;
                int end = cols - 1;

                while (start <= end) {
                    int mid = start + (end - start) / 2;

                    if (matrix[row][mid] == target) {
                        return true;
                    } else if (matrix[row][mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }

        return false;
    }
}
