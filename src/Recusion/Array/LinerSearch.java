package Recusion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinerSearch {
    public ArrayList<Integer> ls(int start,int[] arr,int target){
        ArrayList<Integer> list= new ArrayList<>();
        if(start>=arr.length){
            return list;
        }
        if(arr[start]==target){
            list.add(start);
        }

        return ls(++start,arr,target);
    }
}
