package SlidingWindow;

public class stock121 {
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};
        System.out.println(maxProfit(price));

    }
    public static int maxProfit(int[] prices) {
        int max=0;
        int buy=prices[0];
        for (int i=1; i < prices.length; i++) {
            int profit;
            if(buy>prices[i]){
                buy=prices[i];
            }

                profit=prices[i]-buy;
                max=Math.max(max,profit);

        }
        return max;
    }
}
