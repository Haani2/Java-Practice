package Recusion.Easy;

public class Number {
    public static void main(String[] args) {
      num(5); // recursively print the number
        reverseNum(5); // call the function while removing from stack
    }
    static int num(int n){ // recursive call in each call
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return num(n-1);
    }

    static void reverseNum(int n){ // recursive call the function
        if(n==0){
            return ;
        }
        reverseNum(n - 1);
         System.out.println(n);
    }

}
