package String;

public class SpecialCharacter {
    public static void main(String[] args) {
        String s="Move#Hash#to#Front";
        StringBuilder str= new StringBuilder();

        char[] ch = s.toCharArray();
       for(char c:ch){
           if(c=='#'){
               str.append(c);
           }
       }
       String[] splits=s.split("#");
       for(String s1:splits){
           str.append(s1);
       }
        System.out.println(str.toString());
    }
}
