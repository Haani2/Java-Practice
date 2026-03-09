package Bitwise;
// this even odd operation with the help of bitwise operators
public class EvenOdd {
    public static void main(String[] args) {
        int n = 68;
       boolean result =isodd(n);
        System.out.println(result);
    }
    public static boolean isodd(int n){
        return (n & 1) == 1;
    }
}
