package ASCII;

import java.util.Arrays;

public class EncodedString {
    public static void main(String[] args) {
        System.out.println(encode("abcd9"));
    }
    public static String encode(String s){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                string.append((char)(s.charAt(i)+2));
            }
            else {
                string.append((char)(s.charAt(i)-1));
            }
        }
        return  string.toString();
    }
}
