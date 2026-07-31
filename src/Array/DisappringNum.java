package Array;

import java.util.Arrays;
import java.util.List;

public class DisappringNum {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(findDisappearedNumbers(nums)));
        System.out.println(nums.length);
    }
    public static boolean[] findDisappearedNumbers(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for (int num : nums) {
            arr[num] = true;
            System.out.println(num);
        }
        return arr;
    }
}
