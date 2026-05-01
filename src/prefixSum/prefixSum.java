package prefixSum;

import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        prefixArray(arr);

    }
    //this method of prefix sum make index zero of prefix array zero and start the sum form index 1
    public static void  sentinelZero (int[] arr){

        int[] prefix=new int[arr.length+1];
        int l=1;
        int r=4;

        for (int i=0; i<arr.length ; i++) {
            prefix[i+1]=prefix[i]+arr[i];
        }
        //finds the range
        int range=prefix[r+1]-prefix[l];
        System.out.println(range);
        System.out.println(Arrays.toString(prefix));

    }
    public static void prefixArray(int[] arr){
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            prefix[i]=arr[i]+prefix[i-1];
        }
        // and for range
        //range = prefix[right]-prefix[left-1]
        System.out.println(Arrays.toString(prefix));
    }
}
