package DynamicProgramming.OneDimensionalDP;

import java.util.Arrays;

//leetcode 279
public class PerfectSquares {

    //Recursion
    public boolean isPerfect(int n){
        int sqrt = (int)Math.sqrt(n);
        if(sqrt*sqrt==n) return true;
        return false;
    }

    public int numSquares(int n) {
        if(isPerfect(n)) return 1;
        int min = Integer.MAX_VALUE; // OR can also write n
        for(int i=1;i<=n/2;i++){ //The for loop is splitting n into two parts (i and n-i) and recursively calculating the minimum number of perfect squares for each part. It then takes the smallest among all possible splits.
            int count = numSquares(i) + numSquares(n-i);
            min = Math.min(min,count);
        }
        return min;
    }

    //Memoization
    // But it will also give TLE
    public int minSquares(int n, int[] dp) {
        if (isPerfect(n))
            return 1;
        if (dp[n] != -1)
            return dp[n];
        int min = Integer.MAX_VALUE; // OR can also write n
        for (int i = 1; i <= n / 2; i++) {
            int count = minSquares(i, dp) + minSquares(n - i, dp);
            min = Math.min(min, count);
        }
        return dp[n] = min;
    }

    public int numSquaresMemo(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return minSquares(n, dp);
    }

    //Updated Memoization -> this will be accepted
    // we will only check those numbers whose square is less than n.
    //TC=O(N*N^1/2) SC=O(N)
    public int minSquaresMemo2(int n, int[] dp) {
        if (isPerfect(n))
            return 1;
        if (dp[n] != -1)
            return dp[n];
        int min = Integer.MAX_VALUE; // OR can also write n
        for (int i = 1; i*i <= n ; i++) { //loop till sqrt x, we can write it like this i*i<=n
            //i^2 will always be a perfect square we only have to think about n-i*i
            int count = minSquares(i*i, dp) + minSquares(n - i*i, dp);
            min = Math.min(min, count);
        }
        return dp[n] = min;
    }


    //Tabulation -> Best One
    // //TC=O(N*N^1/2) SC=O(N)
    public int numSquaresTabu(int n) {
        int[] dp = new int[n + 1];
        for(int i=1;i<=n;i++){
            if(isPerfect(i)) dp[i] = 1;
            else{
                int min = Integer.MAX_VALUE;
                for(int j=1;j*j<=i;j++){
                    int count = dp[j*j] + dp[i-j*j];
                    min = Math.min(min,count);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }


    //Another one for Tabulation
    //TC=O(N^2) SC=O(N), but it works
    public int numSquaresTabu2(int n) {
        int[] dp = new int[n + 1];
        for(int i=1;i<=n;i++){
            if(isPerfect(i)) dp[i] = 1;
            else{
                int min = Integer.MAX_VALUE;
                for(int j=1;j<=i/2;j++){ // j<=i/2
                    int count = dp[j] + dp[i-j];// j and i-j
                    min = Math.min(min,count);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }
}
