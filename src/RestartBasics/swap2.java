package RestartBasics;

import java.util.Scanner;

// swap two number without using third variable
public class swap2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        a = b+a;
        b = a-b;
        a = a-b;
        
        System.out.println(a +" " + b);
    }
}
