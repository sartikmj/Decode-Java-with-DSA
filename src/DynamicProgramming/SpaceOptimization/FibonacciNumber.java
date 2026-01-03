package DynamicProgramming.SpaceOptimization;

//Questions in which an array is already given we can not apply space optimization(it does not make any sense) in them
// bcz we can use the already given space in the question

public class FibonacciNumber {

    //In Tabulation instead of making an array of size n, we can make an array of size 3 bcz for every next element
    //we need only three spaces
    // and we will keep switching the old values with the new values

    public int fib(int n) {
        if(n<=1) return n;
        int[] dp = new int[3];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[2] = dp[1] + dp[0];
            dp[0] = dp[1]; //for next time
            dp[1] = dp[2]; //for next time
        }
        return dp[2];
    }
}
