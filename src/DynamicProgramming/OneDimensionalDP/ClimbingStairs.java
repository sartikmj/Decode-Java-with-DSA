package DynamicProgramming.OneDimensionalDP;

//leetcode 70
public class ClimbingStairs {

    public int climb(int n, int[] dp){
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = climb(n-1,dp) + climb(n-2,dp);
    }

    public int climbStairs(int n) {

        int[] dp = new int[n+1];

        return climb(n,dp);
    }
}
