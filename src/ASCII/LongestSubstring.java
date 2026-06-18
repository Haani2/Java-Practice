package ASCII;

public class LongestSubstring {
    public static void main(String[] args) {
      String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int[] count= new int[128];
        int len=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            while (count[s.charAt(i)]>1){
                count[s.charAt(left)]--;
                left++;
            }
            len=Math.max(len,i-left+1);
        }
        return len;
    }
}
