package Bitwise;

public class UniqueNum {
    public static void main(String[] args) {
     int[] arr ={2,3,4,1,2,1,3,6,4};
        System.out.println(FindUnique(arr));
    }
    public static int  FindUnique(int[] arr){
        int unique=0;
        for(int i:arr){
            unique^= i;
        }
        return unique;
    }
}
//| Iteration | num | xorResult (before) | Operation | xorResult (after) | Explanation        |
//| --------- | --- | ------------------ | --------- | ----------------- | ------------------ |
//| 1         | 2   | 0                  | 0 ^ 2     | **2**             | 0 XOR 2 = 2        |
//| 2         | 3   | 2                  | 2 ^ 3     | **1**             | 2(10) ^ 3(11) = 01 |
//| 3         | 4   | 1                  | 1 ^ 4     | **5**             | 001 ^ 100 = 101    |
//| 4         | 1   | 5                  | 5 ^ 1     | **4**             | 101 ^ 001 = 100    |
//| 5         | 2   | 4                  | 4 ^ 2     | **6**             | 100 ^ 010 = 110    |
//| 6         | 1   | 6                  | 6 ^ 1     | **7**             | 110 ^ 001 = 111    |
//| 7         | 3   | 7                  | 7 ^ 3     | **4**             | 111 ^ 011 = 100    |
//| 8         | 6   | 4                  | 4 ^ 6     | **2**             | 100 ^ 110 = 010    |
//| 9         | 4   | 2                  | 2 ^ 4     | **6**             | 010 ^ 100 = 110    |