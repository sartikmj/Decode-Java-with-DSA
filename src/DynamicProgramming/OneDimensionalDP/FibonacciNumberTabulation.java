package DynamicProgramming.OneDimensionalDP;

public class FibonacciNumberTabulation {

    // Tabulation , Bottom Up DP, Iterative DP

    // Saves the call stack space

//    TC=O(N) SC=O(N)

    public int fib(int n){
        if(n<=1) return n;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
