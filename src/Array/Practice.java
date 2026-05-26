package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2]; // this is right if you give size 2 then it will contain 0,1 only hehe
        for(int i=0;i< nums.length;i++) {
            if(map.containsKey(target-nums[i])){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num ={3,3};
        int target=6;
        System.out.println(Arrays.toString(twoSum(num, target)));
    }
}



