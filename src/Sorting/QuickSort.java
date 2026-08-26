package Sorting;

public class QuickSort {
    public static void quicksort(int l,int h,int[] arr) {
      if(l<h){
          int pivot = partition(l,h,arr); // find the pivot
         quicksort(l,pivot-1,arr);
         quicksort(pivot+1,h,arr);
      }

    }
    public static int partition(int l,int h,int[] arr){
        int pi=arr[h];
        int i=l-1; // on first stage it will be -1;
        for(int j=l;j<h;j++){
            if(arr[j]<=pi){
                i++; // on first stage it will increment first then
             swap(arr,i,j); // then swap the value
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 4, 9, 2, 6, 1};

        System.out.println("Before: " + java.util.Arrays.toString(arr));
        quicksort(0, arr.length-1,arr);
        System.out.println("After: " + java.util.Arrays.toString(arr));

    }
}

