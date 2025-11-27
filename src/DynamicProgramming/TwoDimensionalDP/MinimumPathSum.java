package DynamicProgramming.TwoDimensionalDP;

import java.util.Arrays;

// leetcode 64
public class MinimumPathSum {

    // My sol for tabulation
    public int minPathSumByMe(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0]; //first cell

        //we will fill the sum of the cost to reach the particular cell
        //filling the first row and col bcz there is only way to reach them

        //filling
        //cold
        for(int i=1;i<n;i++){
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }
        //rows
        for(int i=1;i<m;i++){
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }

        //now filling the rest inner matrix
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m-1][n-1]; //Minimum Path Sum
    }


    //Tabulation
    // TC=O(m*n) SC=O(m*n)
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) dp[i][j] = grid[i][j]; //first element
                else if(i==0) dp[i][j] = grid[i][j] + dp[i][j-1]; //prefix sum //first row
                else if(j==0) dp[i][j] = grid[i][j] + dp[i-1][j]; //prefix sum //first col
                else dp[i][j] = grid[i][j] + Math.min(dp[i][j-1],dp[i-1][j]); // dp
            }
        }
        return dp[m-1][n-1];
    }

    //Instead of using another array dp we can make changes to the original array
    public int minPathSum1(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                else if(i==0) grid[i][j] += grid[i][j-1];
                else if(j==0) grid[i][j] += grid[i-1][j];
                else grid[i][j] += Math.min(grid[i][j-1],grid[i-1][j]);
            }
        }
        return grid[m-1][n-1];
    }

    //Memoization -> Do it by yourself

    public int minPath(int row, int col, int m, int n, int[][] grid, int[][] dp){
        if(row>=m || col>=n) return Integer.MAX_VALUE;
        if(row == m-1 && col == n-1) return grid[row][col];

        if(dp[row][col]!=-1) return dp[row][col];

        return dp[row][col] = grid[row][col] + Math.min(minPath(row+1,col,m,n,grid,dp),minPath(row,col+1,m,n,grid,dp));
    }
    public int minPathSumMemo(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return minPath(0,0,m,n,grid,dp);
    }

    public static void main(String[] args) {

    }
}
