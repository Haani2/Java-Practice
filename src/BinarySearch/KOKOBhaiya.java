package BinarySearch;

import java.util.Arrays;

// koko is eating banana
public class KOKOBhaiya {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
int start=1;
int end=max;
        int ans=0;
    while (start<=end){
         int mid=start+(end-start)/2;
            int r = requiredTime(piles, mid);
            if (r <= h) {
                ans= mid;
                end=mid-1;
            }
            else{
              start=mid+1;
            }
        }

        return ans;
    }

    public int requiredTime(int[] piles, int i) {
        int totalTime = 0;

        for(int j = 0; j < piles.length; j++) {

            totalTime += (piles[j] + i - 1) / i;
        }
        return totalTime;
    }
}
