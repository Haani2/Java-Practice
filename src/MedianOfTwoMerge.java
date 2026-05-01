public class MedianOfTwoMerge {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] arr2={4,5,6};
        double result =Median(arr,arr2);
        System.out.println(result);
    }
    public static double Median(int[]num1,int[] num2){
        int last=num1.length;
        int first = num2[0];

         return (double)(first + last) /2;

    }
}

