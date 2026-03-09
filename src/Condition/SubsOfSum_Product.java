package Condition;

public class SubsOfSum_Product {
    public static void main(String[] args) {
        int N = 234;
        int product = 1;
        int sum = 0;
        while (N>0){
            int num = N%10;
            product = num*product;
            sum = num+sum;

             N = N/10;
        }
        System.out.println(product - sum );

    }
}
