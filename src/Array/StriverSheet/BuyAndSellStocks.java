package Array.StriverSheet;

public class BuyAndSellStocks {

    // TC=O(n^2)
    public int buyAndSellStocks1(int prices[]) {
        // Code here
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }


    //Optimal TC=O(n)
    public static int buyAndSellStocks(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

}