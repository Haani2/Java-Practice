package Bitwise;
// find the number of digit in base b
public class FindNumOfDigits {
    public static void main(String[] args) {
        int a =10;
        int b =2;
        int ans = (int)(Math.log(a)/Math.log(b)+1);
        System.out.println(ans);
        //complexity is O(log n )
    }
}



