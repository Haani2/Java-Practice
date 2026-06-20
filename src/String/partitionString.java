package String;

import java.util.HashSet;

public class partitionString {
    public static void main(String[] args) {
        String s="abacaba";
        System.out.println(partitionStrings(s));
    }
    static int partitionStrings(String s) {
        HashSet<String>set = new HashSet<>();
         int count=0;
        for (int i = 0; i <s.length() ; i++) {
             if(set.contains(String.valueOf(s.charAt(i)))){
                 set.clear();
                 count++;
             }
            set.add(String.valueOf(s.charAt(i)));
        }
        return count+1;
    }
}
