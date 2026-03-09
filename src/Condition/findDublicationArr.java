package Condition;

public class findDublicationArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5};

   FindNumber(arr ,3);


    }
     static int FindNumber(int[] arr , int target){
         int length = arr.length - 1;
         int i =0;
         int j =length;
         while (i < j){
              if (arr[i]==target && arr[j] == target){
                  System.out.println("start"+i);
                  System.out.println("end" + j);
              }
              i++;
              j--;
         }
         return -1;
     }
}
