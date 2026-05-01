package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Utkarsh",92);
        map.put("hani",80);
        map.put("naveen",31);

        System.out.println(map.get("hani"));

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(23);

        System.out.println(set);
    }
}
