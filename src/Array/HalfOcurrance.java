package Array;


import java.util.Arrays;
import java.util.HashMap;

public class HalfOcurrance {
//    public static int majorityElement(int[] nums) {
//            int left=0;
//            for(int i=0;i<nums.length;i++){
//                if(nums[left]!=nums[i]){
//                    int temp=nums[left];
//                    nums[left]=nums[i];
//                    nums[i]=temp;
//                    left++;
//                }
//            }
//            System.out.println(Arrays.toString(nums));
//            return nums[nums.length/2];
//   }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(i>nums.length/2){
                return map.get(i);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums={-1,1,1,1,2,1};
        // majorityElement(nums);
    }
}
