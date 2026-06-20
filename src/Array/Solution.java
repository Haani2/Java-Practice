package Array;


import java.util.Arrays;

class Solution {
   static void segregate0and1(int[] arr) {
        // code here
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr ={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate0and1(arr);
    }
}
