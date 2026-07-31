package String;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
            String s="abba";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxSize=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                maxSize=Math.max(map.size(),maxSize);
                map.remove(s.charAt(left));
                left++;
            }
            map.put(s.charAt(right),right);
        }
        return maxSize;
    }
}
