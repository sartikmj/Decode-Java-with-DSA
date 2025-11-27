package DynamicProgramming.TwoDimensionalDP;

import java.util.Arrays;

public class UniquePaths {

    // Recursion
    public int uniquePaths(int m, int n) {
        return paths(0, 0, m, n);
    }

    private int paths(int row, int col, Integer m, Integer n) {
        if (row >= m || col >= n) return 0;
        if (row == m - 1 && col == n - 1) return 1; //means we found a path from starting to ending i.e 1 path.
        int rightways = paths(row, col + 1, m, n);
        int downways = paths(row + 1, col, m, n);
        return rightways + downways;
    }

    // Memoization
    // TC=O(m*n) AS=O(m*n)
    public int uniquePathsMemo(int m, int n) {
        // row: 0 to m-1 | col: 0 to n-1
        int[][] dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return pathsMemo(0, 0, m, n, dp);
    }

    private int pathsMemo(int row, int col, Integer m, Integer n, int[][] dp) {
        if (row >= m || col >= n) return 0;
        if (row == m - 1 && col == n - 1) return 1; //means we found a path from starting to ending i.e 1 path.

        if (dp[row][col] != -1) return dp[row][col];

        int rightways = pathsMemo(row, col + 1, m, n, dp);
        int downways = pathsMemo(row + 1, col, m, n, dp);
        return dp[row][col] = rightways + downways;
    }

    // Very Important -> Tabulation in grid problems
    // Tabulation
    // TC=O(m*n) SC=O(m*n)
    public int uniquePathsTabu(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) dp[i][j] = 1; //fill first row and col with 1 bcz there is only 1 way to reach them
                else dp[i][j] = dp[i][j-1] + dp[i-1][j]; //number of ways to reach is sum of the ways of prev upper and left cell
            }
        }
        return dp[m-1][n-1]; //last cell has the total number of ways
    }

}
