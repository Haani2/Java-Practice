package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
           int lastIndex=arr.length-i-1;
           int max=max(arr,0,lastIndex);
           swap(arr,max,lastIndex);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int max(int[] arr ,int start,int j){
        int max=start;
        for(int i=start;i<=j;i++){
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr= {2,8,9,4,5,12,1};
        selectionSort(arr);
    }

}
