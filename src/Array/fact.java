package Array;

import java.util.ArrayList;
import java.util.List;

public class fact {
    public static void main(String[] args) {
        kthFactor(12,3);
    }
    public static void kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }System.out.print(list+",");
    }
}
