package DynamicProgramming.UnboundedKnapsack;

public class UnboundedKnapsack {

    //Every item has unlimited supply

    //We will try out all possible ways
    //total ways in this will be more than 2^n

    //the difference in code is that is when we skip we move to the next element,
    //but when we pick we may or may not move to the next element
    //for every pick we will have two options for the same element to pick it or skip it
    //

    //Recursion + Memoization
    public static int profitMemo(int i, int[] wt, int[] val, int capacity, int[][] dp) { // i is the index
        if(i==wt.length) return 0;
        if(dp[i][capacity]!=-1) return dp[i][capacity];
        int skip = profitMemo(i+1,wt,val,capacity,dp);
        if(wt[i]>capacity) return dp[i][capacity] = skip;

        //Everything is same its just we do not move next on take i.e. it will not be i+1 just i
        int take = val[i] + profitMemo(i,wt,val,capacity-wt[i],dp);
        return dp[i][capacity] = Math.max(take, skip);
    }


    public static void main(String[] args) {
        int[] val = {6,3,7,25};
        int[] wt = {2,2,8,9};
        int capacity = 9;
        // i = 0 to n-1
        // capacity = capacity to 0 -> two things are varying hence we use Two Dimensional DP
        int n = val.length;

        int[][] dp = new int[n][capacity+1]; //capacity+1 bcz capacity + including 0
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(profitMemo(0, wt, val, capacity, dp));
    }
}
