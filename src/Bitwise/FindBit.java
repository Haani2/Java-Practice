package Bitwise;
//find the nth bit is one or zero
public class FindBit {
    public static void main(String[] args) {
        System.out.println(Bitset(5,1));
    }
    public static void BitCheck(int num, int pos){
         if(((1<<pos)&num)==0){
             System.out.println("0 is on that position");
         }
         else {
             System.out.println("1 on the position ");
         }

    }
    public static int Bitset(int num, int pos){
        return (1<<pos)|num ;
    }
}
