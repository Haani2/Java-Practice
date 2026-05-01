package HashMap;

import java.util.HashSet;

public class DoubleSize {

    public static void main(String[] args) {
        int[] arr = {2,8,5,10};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
  int i=0;
        for(int j = 0; j < arr.length; j++) {
            set.add(arr[j]);
        }
         while(i<= arr.length-1) {
            if(set.contains(arr[i]*2)){
                return true;
            }
            else {
                i++;
            }
        }

   return false;
    }

}
