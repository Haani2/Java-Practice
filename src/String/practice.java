package String;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String S =s.toLowerCase().trim().replaceAll(" ","").replaceAll("[^a-z]","");
        System.out.println(S);
        int start = 0;
        int end = S.length()-1;
        while (start<end){
            if(S.charAt(start)!=S.charAt(end)){
                System.out.println(false);
            }

            start++;
            end--;
        }
        System.out.println(true);
    }
}
