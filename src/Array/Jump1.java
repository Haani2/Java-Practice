package Array;

public class Jump1 {
    public static boolean arrJump(int[] arr){

        int lastIndex= arr.length-1;

        for (int i=lastIndex-2; i>=0; i--) {
                  if(arr[i]+i>=lastIndex){
                  lastIndex=i;
                  }
        }
return lastIndex==0;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        boolean result = arrJump(arr);
        System.out.println(result);
    }
}
