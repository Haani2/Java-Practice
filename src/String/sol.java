package String;

import java.util.HashSet;

public class sol {
    public static void main(String[] args) {
        System.out.println(isBalanced("[{()}]"));
    }
    public static boolean isBalanced(String s) {
        // code here.
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(String.valueOf(s.charAt(i)));
        }
        return set.contains("()") || set.contains("{}") || set.contains("[]");
    }
}
