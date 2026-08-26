package Recusion.Array;

public class LinearSearch {
    public static int LS(int start ,int[] arr,int target){


        if (start>=arr.length) {
            return -1;
        }
        else if(arr[start]==target){
            return start;
        }


        return LS(++start,arr,target);
    }
}
