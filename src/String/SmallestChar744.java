package String;

public class SmallestChar744 {
    public static void main(String[] args) {
        char[] letter = {'c', 'f', 'j'};
        char target = 'd';
        System.out.println(nextGreatestLetter(letter, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        char ans=letters[start];
        while (start<end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                ans=letters[mid];
                end=mid-1;
            }
            else{
                start++;
            }


        }
        return ans;
    }
}

