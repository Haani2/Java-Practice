package CollectionFrameWork.ListInterface;
import java.util.*;
public class ListUsage {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
      ListIterator<Integer> it = list.listIterator(3);// use to iterate on list
        List l= new ArrayList(List.of(1, 2, 3, 4, 5, 6, 7));

    }
}
