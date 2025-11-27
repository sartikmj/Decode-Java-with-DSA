package DynamicProgramming.OneDimensionalDP;

import java.util.Arrays;

//leetcode 1137
public class TribonacciSeries {

    //Recursion
    public int tribonacci(int n) {
        if (n == 0 || n == 1) return n;
        if (n == 2) return 1;
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    //Memoization
    public int tri(int n, int[] dp) {
        if (n == 0 || n == 1) return n;
        if (n == 2) return 1;

        if (dp[n] != -1) return dp[n];
        return dp[n] = tri(n - 1, dp) + tri(n - 2, dp) + tri(n - 3, dp);
    }

    public int tribonacciMemo(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return tri(n, dp);
    }

    //Tabulation
    public int tribonacciTabu(int n) {
        //edge cases
        if(n==0) return 0;
        if(n==1 || n==2) return 1;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
}
