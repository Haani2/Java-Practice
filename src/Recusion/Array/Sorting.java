package Recusion.Array;

public class Sorting {
     static boolean checkSorted(int[] arr,int curr){
        if(curr== arr.length-1){
            return true;
        }
        return arr[curr]<arr[curr+1] && checkSorted(arr,curr+1);
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(checkSorted(arr,0));
    }
}
