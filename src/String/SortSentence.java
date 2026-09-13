package String;

import java.util.Arrays;

public class SortSentence {
    public String sortSentence(String s) {
        String[] word=s.split(" ");
        String[] result= new String[word.length];
        for (String srt:word) {
           char[] chars=srt.toCharArray();
           for (char ch:chars){
               if(Character.isDigit(ch)){
                   srt=srt.replace(ch,' ');
                   result[Character.getNumericValue(ch)-1]=srt;
               }
           }
        }

        return Arrays.toString(result).replace("[","").replaceAll("]","").replaceAll(","," ").replaceAll("\\s+", " ").strip();

    }
}

