package DynamicProgramming.UnboundedKnapsack;

import java.util.Arrays;

public class CoinChange {

    //unbounded knapsack type question
    //try out all possible combinations

    //By Sir

    //changing the return type to long bcz ans is getting out of int range
    public long coinCount(int i,int[] coins, int amount, long[][] dp){
        if(i==coins.length){
            if(amount==0) return 0; //no more coins needed
            else return Integer.MAX_VALUE; //not a valid combination, means amount is still positive
            // not return -1 bcz then it will come in the ans in return Math.min();
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        long skip = coinCount(i+1,coins,amount,dp);
        if(amount-coins[i]<0) return dp[i][amount] = skip;
        long take = 1 + coinCount(i,coins,amount - coins[i],dp);
        return dp[i][amount] = Math.min(take,skip);
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        // i is varying from 0 to n-1 and amount is varying from amount to 0
        long[][] dp = new long[n][amount+1]; //the result of the calls is in long so dp is also of long datatype
        for(long[] ele : dp){
            Arrays.fill(ele,-1);
        }
        int ans = (int)coinCount(0,coins,amount,dp);
        return ans==Integer.MAX_VALUE?-1:ans;
    }


    //Tabulation Method
    // -> use the Memoization to make Tabu, first traverse from n-1 to 0, then make two for loop
    // i and j , then insert the main code(exactly the same changing it to traverse from n-1 to 0) logic in the loops and
    // replace the target or amount with j, i will be the same, instead of calling method access the dp array.
    public static int coinChangeTabu(int[] coins, int amount){
        int n = coins.length;
        long[][] dp = new long[n][amount+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                long skip = i>0 ? dp[i-1][j] : j==0 ? 0 : Integer.MAX_VALUE ; //else has the value of base case.;
                if(j-coins[i]<0) dp[i][j] = skip;
                else{
                    long pick = 1 + dp[i][j-coins[i]]; //j is representing amount
                    dp[i][j] = Math.min(skip, pick);
                }
            }
        }
        int ans = (int)dp[n-1][amount];
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }

    //Space Optimization
    public static int coinChangeSpace(int[] coins, int amount){
        int n = coins.length;
        long[][] dp = new long[2][amount+1]; // i-1:0 & i=1, i is index
        //replace i with 1 -> only in dp array
        for(int i=0;i<n;i++){
            for(int j=0;j<amount+1;j++){
                long skip = i>0 ? dp[1-1][j] : j==0 ? 0 : Integer.MAX_VALUE ; //else has the value of base case.;
                //leave i as it is in while accessing coins array
                if(j-coins[i]<0) dp[1][j] = skip;
                else{
                    long pick = 1 + dp[1][j-coins[i]]; //j is representing amount
                    dp[1][j] = Math.min(skip, pick);
                }
            }
            //copy paste 1st row to 0th row
            for(int j=0;j<amount+1;j++){
                dp[0][j] = dp[1][j];
            }
        }
        int ans = (int)dp[1][amount];
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }


    //Used ChatGPT for this

    //Code without making return type long, just store Integer.MAX_VALUE-1 in take and in the end while returning also
    // compare the ans with Integer.MAX_VALUE.

    public int coins(int i, int[] coins, int amount, int[][] dp) {
        if (i == coins.length) {
            if (amount == 0) return 0;
            else return Integer.MAX_VALUE - 1;
        }

        if (dp[i][amount] != -1) return dp[i][amount];

        int skip = coins(i + 1, coins, amount, dp);
        int take = Integer.MAX_VALUE - 1;

        if (coins[i] <= amount)
            take = 1 + coins(i, coins, amount - coins[i], dp);

        return dp[i][amount] = Math.min(skip, take);
    }

    public int coinChange1(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int ans = coins(0, coins, amount, dp);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }





}
