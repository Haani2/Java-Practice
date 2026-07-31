package CollectionFrameWork;

import java.util.*;

public class Iterable_Interface {
    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> it= list.iterator();// you have to use list
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
