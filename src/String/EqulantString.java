package String;

public class EqulantString {
    public static void main(String[] args) {
        String[] wrd1={"abc", "d", "defg"};
        String[] wrd2={"abcddefg"};
        String string1=" ";
        String string2=" ";
        for (String word:wrd1){
            string1+=word;
        }

        for(String word:wrd2){
            string2+=word;
        }

        System.out.println();
    }

}
    