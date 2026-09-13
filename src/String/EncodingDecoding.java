package String;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class EncodingDecoding {
    public static String encode(String[] arr) {
        // write your logic to encode the strings
        StringBuilder s = new StringBuilder();
        for(String sc: arr){
            s.append(sc.length()).append("/:").append(sc);
        }

   return s.toString();
    }

    public static ArrayList<String> decode(String s) {
        // write your logic to decode the string
        ArrayList<String> result= new ArrayList<>();
        String[] arr= s.split("/:");
        for(String sc: arr){
            result.add(sc.replaceAll("/:","").replaceAll("\\d","").strip());
        }
     return result;
    }

    public static void main(String[] args) {
        String[] sc= {"Hello","World"};
        String encoded=encode(sc);
        System.out.println(encoded);
        System.out.println(decode(encoded));
    }
}
