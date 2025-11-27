package DynamicProgramming.OneDimensionalDP;

import java.util.Arrays;

// leetcode 746
public class MinCostClimbingStairs {

    // NOTE -> You can start with 0th or 1st index and can end on n-1th or n-2th index.

    // Recursive Code -> will give TLE error
    //TC=O(2^n), SC=O(N)

    // here we are going from top to bottom, you can also go from bottom to top

    public int minCost(int[] cost, int idx){ // idx is starting index.
        if(idx==0 || idx==1) return cost[idx];
        return cost[idx] + Math.min(minCost(cost, idx-1),minCost(cost, idx-2));
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(minCost(cost,n-1),minCost(cost,n-2));// you have to reach either last or second last step.
        // bcz top is n and it can be reached from n-1 with 1 step or from n-2 with 2 steps
    }



    // Memoization DP Code
    // TC=O(N), SC=O(N)
    // here we are going from top to bottom, you can also go from bottom to top

    public int minCost(int[] cost, int idx, int[] dp){ // idx is starting index.
        if(idx==0 || idx==1) return cost[idx];

        if(dp[idx]!=-1) return dp[idx];

        return dp[idx] = cost[idx] + Math.min(minCost(cost, idx-1, dp),minCost(cost, idx-2, dp));
    }

    public int minCostClimbingStairsDPMemo(int[] cost) {
        int n = cost.length;
        // n is going from n-1/n-2 to 0/1.
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,n-1, dp),minCost(cost,n-2, dp));
    }

    // Tabulation DP Code
    //

    public int minCostClimbingStairsDPTabu(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];

        for(int i=2;i<n;i++){
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]); //the array will contain the min of till that index
        }

        return Math.min(dp[n-1], dp[n-2]); // at the end return the min of n-1th and n-2th index
    }

}
