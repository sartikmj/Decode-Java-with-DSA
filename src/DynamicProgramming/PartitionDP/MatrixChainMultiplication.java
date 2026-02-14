package DynamicProgramming.PartitionDP;

import java.util.Arrays;

public class MatrixChainMultiplication {

    //for 2D matrix
    //You can also use this code to find the maxCost instead of minCost just change the min to max.
    public static int mcm(int i, int j, int[][] arr, int[][] dp){
        if(i==j) return 0; //base case, when after partitioning there is only one matrix left, hence the cost is 0.
        if(dp[i][j]!=-1) return dp[i][j];

        int minCost = Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            int x = arr[i][0] * arr[k][1] * arr[j][1]; //cost of multiplying the resultant matrices
            int tc = mcm(i,k,arr,dp) + mcm(k+1,j,arr,dp) + x; //total cost
            minCost = Math.min(minCost,tc);
        }
        return dp[i][j] = minCost;
    }

//    ------------------ THIS ONE IS MORE IMPORTANT -------------------
//    for 1D matrix
    // j will be at n-2

    //TC=O(n^3) SC=O(n^2)
    public static int mcm1(int i, int j, int[] arr, int[][] dp){
        if(i==j) return 0; //base case, when after partitioning there is only one matrix left, hence the cost is 0.
        if(dp[i][j]!=-1) return dp[i][j];

        int minCost = Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            int x = arr[i] * arr[k+1] * arr[j+1]; //cost of multiplying the resultant matrices
            int tc = mcm1(i,k,arr,dp) + mcm1(k+1,j,arr,dp) + x; //total cost
            minCost = Math.min(minCost,tc);
        }
        return dp[i][j] = minCost;
    }

    //Tabulation

    //as in memoization , i -> 0 to n and j -> n to 0
    //in tabulation they go opposite. So, i -> n to 0 and j -> 0 to n

    public static int mcmTabu(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n-1][n-1];

        for(int i=n-2;i>=0;i--){
            for(int j=i;j<=n-2;j++){

                if(i==j){
                    dp[i][j] = 0;
                    continue; //base case so below code will not run
                }

                int minCost = Integer.MAX_VALUE;

                for(int k=i;k<j;k++){
                    int x = arr[i] * arr[k+1] * arr[j+1]; //cost of multiplying the resultant matrices
                    int tc = dp[i][k] + dp[k+1][j] + x; //total cost
                    minCost = Math.min(minCost,tc);
                }
                dp[i][j] = minCost;
            }
        }

        return dp[0][n-2];
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2},{2,3},{3,4},{4,2}};
        int[] arr1 = {1,2,3,4,2}; //4 matrices
        int n = arr.length;
        int n1 = arr1.length;

        int[][] dp = new int[n-1][n-1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }

        int[][] dp1 = new int[n1-1][n1-1];
        //                    k   j

        for(int[] i : dp1){
            Arrays.fill(i,-1);
        }

//        System.out.println(mcm(0,n-1,arr,dp));
//        System.out.println(mcm1(0,n1-2,arr1,dp1));

        System.out.println(mcmTabu(arr1));
    }
}
