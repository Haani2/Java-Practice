package String;

import HashMap.Hashmap;

import java.util.HashMap;

public class romenNumber {
    public static int romanToInt(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] chars=s.toCharArray();
             int count=0;
             int prev=0;

        for(int i=chars.length-1;i>=0;i--) {
            int curr=map.get(chars[i]);
            if(curr<prev){
                count-=curr;
            }
            else {
                count+=curr;
            }
            prev=curr;
        }
 return count;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("II"));
    }
}
