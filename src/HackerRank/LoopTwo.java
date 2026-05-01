package HackerRank;

import java.util.Scanner;
import java.util.StringJoiner;

public class LoopTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t= in.nextInt();// number of time querry runs
        while(t-->0){ // use post decrement here after checking it will decrement
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            int sum=0;
            var joinner = new StringJoiner(" "); // useage new which join the string with giving space seprator
            for (int i = 0; i < n; i++){
                sum=sum*2+1;
                joinner.add(String.valueOf(a+b*(long)sum));
            }
            System.out.println(joinner);
        }

    }
}
