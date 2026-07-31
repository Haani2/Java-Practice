package Lamda;

public class Calculator {
    public static void main(String[] args) {
        sum add= (a,b)->a+b; // lamda expression

        addition(5,6,add);

    }
    private static void addition(int a, int b, sum sum){
        System.out.println(sum.add(a,b));
    }

    @FunctionalInterface
    interface sum{         // need to create a class with method in it
         int add(int a,int b);
    }
}
