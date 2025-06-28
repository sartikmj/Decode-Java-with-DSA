package Array.StriverSheet;

public class BuyAndSellStocks {

    // Fore every element , find it's previous Minimum Element
    public static int buyAndSellStocks(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            int cost = prices[i]-min;
            maxProfit = Math.max(maxProfit,cost);
            min = Math.min(min,prices[i]);
        }
        return maxProfit;
    }
}
