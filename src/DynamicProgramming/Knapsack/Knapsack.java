package DynamicProgramming.Knapsack;

public class Knapsack {

    // 0/1 Knapsack

    // We have three problems
    // wt[i] > c, we will skip it
    // wt[i] < c, then we have two options -> whether we take the item or we skip the item.

    //Recursion -> Trying all the possible combinations
    //TC=O(2^n) AC=O(n*c)
    public static int profit(int i, int[] wt, int[] val, int capacity) { // i is the index
        if(i==wt.length) return 0;
        int skip = profit(i+1,wt,val,capacity); // we skip the item
        if(wt[i]>capacity) return skip;
        int take = val[i] + profit(i+1,wt,val,capacity-wt[i]); // we take the item
        return Math.max(take, skip);
    }

    //Memoization
    // TC=O(n*c) AC=O(n*c)
    public static int profitMemo(int i, int[] wt, int[] val, int capacity, int[][] dp) { // i is the index
        if(i==wt.length) return 0;
        if(dp[i][capacity]!=-1) return dp[i][capacity];
        int skip = profitMemo(i+1,wt,val,capacity,dp); // we skip the item
        if(wt[i]>capacity) return dp[i][capacity] = skip; // add in dp here
        int take = val[i] + profitMemo(i+1,wt,val,capacity-wt[i],dp); // we take the item
        return dp[i][capacity] = Math.max(take, skip); // add in dp here
    }


    public static void main(String[] args) {
        int[] val = {5,3,7,16};
        int[] wt = {1,2,8,10};
        int capacity = 8;
        // i = 0 to n-1
        // capacity = capacity to 0 -> two things are varying hence we use Two Dimensional DP
        int n = val.length;
        int[][] dp = new int[n][capacity+1]; //capacity+1 bcz capacity + including 0
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

//        System.out.println(profit(0,wt,val,capacity));
        System.out.println(profitMemo(0,wt,val,capacity,dp));

    }
}
