package Array;

import java.util.HashMap;

public class twoSum {
    public int[] TwoSum(int[] nums, int target) {

        int[] arr= new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);

            arr[0]=i;
            if(map.containsKey(target-nums[i])){
                arr[1]=map.get(nums[i]);
            }

        }
        return arr;

    }
}
