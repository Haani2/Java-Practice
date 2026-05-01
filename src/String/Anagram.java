package String;

public class Anagram {
    public static void main(String[] args) {
        String s = "abcab";
        String p ="ba";
        int n =p.length();
        int count =0;
        String s1 = s.substring(0,n);
        System.out.println(s1.contains(p));



//        for(int i = 0; i < s.length(); i++) {
//          String s1 = s.substring(0,n);
//          if(s1.contains(p)){
//
//          }
//        }

        System.out.println(s1);
    }
}
