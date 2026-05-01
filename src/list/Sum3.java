package list;

import java.util.*;

public class Sum3 {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>>list = new HashSet<>();
            for (int i = 0; i <nums.length ; i++) {
               int k = nums[i];
               int target =-k;

               int l=i+1;
               int r= nums.length-1;

               while(l!=r){
                   int sum= nums[l]+nums[r];
                   if(sum==target){
                       list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                       l++;
                       r--;
                   }
                   else if(sum>target){
                       l++;
                   }
                   else {
                       r--;
                   }
               }

            }
        return new ArrayList<>(list);
        }
}
