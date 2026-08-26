package Recusion.Array;

public class CheckSorted {
    public boolean checkSort(int[] arr,int start){
        if(arr.length<=1){
            return true;
        }
        if(start==arr.length-1){
            return true;
        }
        return arr[start]>=arr[start+1] && checkSort(arr,++start);
    }
}
