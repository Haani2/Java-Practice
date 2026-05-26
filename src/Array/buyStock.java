package Array;

public class buyStock {
    public static int maxProfit(int[] prices) {
      int minPrice=prices[0];
      int result=0;
        for (int i = 1; i <prices.length; i++) {
            int maxPrice = 0;
            int maxProfit;
            if(prices[i]<minPrice) {
                minPrice = prices[i];
            }
            maxPrice=prices[i];
            maxProfit=maxPrice-minPrice;
            result=Math.max(maxProfit,result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};
        System.out.println(maxProfit(price));

    }
}
