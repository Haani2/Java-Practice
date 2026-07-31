package String;

public class IPAdress {
    public static void main(String[] args) {
        System.out.println(isValid("222.111.111.111"));
    }
    public static boolean isValid(String s) {
        // code here
        int start=0;
        for(int i=0;i<s.length();i++){
            String substring = s.substring(start,i);
            if(s.charAt(i)=='.'){
                int ip=Integer.parseInt(substring);
                if(ip>255||ip<0){
                    return false;
                }
                else{
                    start=i+1;
                    substring=" ";
                }
            }
        }
        return true;
    }
}
