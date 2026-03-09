package Array;

import java.sql.Array;
import java.util.Arrays;

public class createTargetArray {
    public static int[] CreateTargetArray(int[] nums, int[] index) {
        int size =0;
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int x = index[i];
            for (int j = i; j >x; j--) {
                 temp[j] =  temp[j-1];
            }
            temp[index[i]] = nums[i];
            size++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,0};
        int[] b ={0,1,2,3,0};
        int[] c = CreateTargetArray(a,b);

        System.out.println(Arrays.toString(c));
    }
}
