package Array;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
    public static void duplicateZeros(int[] arr) {
     int n= arr.length-1;
        for (int i=0;i<n;i++) {
            if(arr[i]==0) {
                for (int j = n; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++; // because it counts the next zero which make the next elements zero
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
