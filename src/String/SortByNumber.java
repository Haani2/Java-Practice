package String;

import java.util.Arrays;

public class SortByNumber {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3 ";
        String[] arrstring =s.split(" ");
        String result =" ";
        for (int i = 1; i <=s.length(); i++) {

            for (String word:arrstring) {
                int pos= word.charAt(word.length()-1)-'0';

                if(pos==i){
                    result=result+word.substring(0,word.length()-1)+" ";
                }
            }
        }
        System.out.println(result.trim());




    }
}