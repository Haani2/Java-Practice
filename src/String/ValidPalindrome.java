package String;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        String newS= s.toLowerCase().replaceAll("[^a-z0-9]","").trim();
         int i = 0;
         int j= newS.length()-1;
         boolean ans = true;
         while (i<j){
             if (newS.charAt(i) != newS.charAt(j)) {
                 ans = false;
                 break;
             }
             i++;
             j--;
         }
        System.out.println(ans);
    }
//    public boolean isPalindrome(String s) {
//
//
//
//    }
}
