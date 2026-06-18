package Array;

public class HappyNumber {
    public static void main(String[] args) {

    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do{ slow=square(slow);
            fast=square(square(fast));}
        while (slow!=fast);
        return slow == 1;
    }
    public static int square(int num){
        int square=0;
        while (num!=0){
            int n=num%10;
            square+=n*n;
            num=num/10;
        }
        return square;
    }
}
