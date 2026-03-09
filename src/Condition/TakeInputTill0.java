package Condition;

import java.util.Scanner;

public class TakeInputTill0 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the number");
        int number = n.nextInt();
        int sum= number;
       while (n.nextInt()>0){
           sum = sum+number;
       }
        System.out.println("the sum is " + sum);

       }
}
