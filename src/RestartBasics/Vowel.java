package RestartBasics;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String alp = in.nextLine();

        if(alp.indexOf(0) == 'a' || alp.indexOf(0) == 'e' || alp.indexOf(0) == 'i'|| alp.indexOf(0) == 'o'|| alp.indexOf(0) == 'u'){
            System.out.println("vowels");
        }
        else {
            System.out.println("consonant");
        }



    }
}
