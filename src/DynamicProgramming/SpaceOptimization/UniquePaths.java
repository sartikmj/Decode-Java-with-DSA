package DynamicProgramming.SpaceOptimization;

public class UniquePaths {

    //For every element we only need the one above row, and one left column not any other row or col
    //so we will only keep one row and one column to store elements

    //TC=O(m*n) SC=O(n)

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[2][n];
        for(int j=0;j<n;j++){
            dp[0][j] = 1;
            dp[1][j] = 1;
        }
        for(int i=1;i<=m-1;i++){ //m-1 times
            // DP wala kaam
            for(int j=1;j<n;j++){
                dp[1][j] = dp[1][j-1] + dp[0][j];
            }
            //copy the first row to 0th row
            for(int j=1;j<n;j++){
                dp[0][j] = dp[1][j];
            }
        }
        return dp[1][n-1];
    }

    //Instead of copying pasting 1st row to the 0th row
    // you can use the prev row to store the new elements

    // TC=O(m*n) SC=O(n) -> This is the best one.

    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[2][n];
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
            dp[1][j] = 1;
        }
        for (int i = 1; i <= m - 1; i++) { //m-1 times
            // DP wala kaam
            if (i % 2 == 1) {

                for (int j = 1; j < n; j++) {
                    dp[1][j] = dp[1][j - 1] + dp[0][j];
                }
            }
            //copy the first row to 0th row
            else {

                for (int j = 1; j < n; j++) {
                    dp[0][j] = dp[0][j-1] +  dp[1][j];
                }
            }
        }
        return Math.max(dp[1][n-1], dp[0][n-1]);
    }
}
