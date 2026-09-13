package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr= {2,8,9,4,5,12,1};
        bubbleSort(arr);
    }
}
