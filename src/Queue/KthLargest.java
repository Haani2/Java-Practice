package Queue;

import java.util.*;
import java.util.Queue;

public class KthLargest {

    List<Integer> list= new ArrayList<>();
    int highest=0;
    public KthLargest(int k, int[] nums) {
        for(int i:nums){
            list.add(i);
        }
     highest=k;

    }

    public int add(int val) {

      list.addLast(val);
      list.sort(null);

        return list.get(list.size()-highest);

    }

}
