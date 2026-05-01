package BinarySearch;

import java.sql.Array;

//34. Find First and Last Position of Element in Sorted Array
public class FindOccrance {
    public int[] searchRange(int[] nums, int target) {

        return  new int[]{SearchFirst(nums,target),SearchLast(nums,target)}; // I can just do this when questions ask to return in array format;
    }


    public static int SearchFirst(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                 end=mid-1;
            }
        }
        return result;
    }
    public static int SearchLast(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                start=mid+1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return result;
    }

}
