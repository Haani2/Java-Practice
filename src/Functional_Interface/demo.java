package Functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class demo {
    public static void main(String[] args) {
        //Function interface has a single method name "apply()"
        //Ek input leta hai (type T), ek output deta hai (type R). Transform karne ke liye use hota hai.
        Function<Integer,Integer> square = x->x*x; // single variable lamda expression
        //System.out.println(square.apply(5));

        Consumer<Integer> print = x-> System.out.println(x); // simply take input and return a void output
        //print.accept(5);

        Supplier doSomething= ()->(int)(Math.random()*100); // doesnt take input just give the output
         //System.out.println(doSomething.get());

        Predicate<Integer> tellMe = x->x%2==0;
       // System.out.println(tellMe.test(6));

        //for more simplicity there is a method reference
        // using classname::methodName
        List<Integer> list=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));
        list.forEach(System.out::println); // just print number simply

    }


}
