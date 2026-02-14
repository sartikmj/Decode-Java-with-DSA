package DynamicProgramming.Knapsack;

import java.util.Arrays;

public class TargetSum {

    // Recursion
    public int ways(int i, int[] arr, int target){
        //base case
        if(i==arr.length){
            if(target==0) return 1; // 1 valid way
            else return 0; // not a valid way
        }
        int add = ways(i+1,arr,target-arr[i]); //adding a number to get result
        int sub = ways(i+1,arr,target+arr[i]); //subtracting a number to get result

        return add+sub; //to get all the ans bcz and can come from add or sub both
    }


//    In this question you need to take another variable sum, subtracting on target will not work, bvz the sum is going
//    negative too.

    //Memoization
    //Memoization
    static int sum;
    public int waysMemo(int i, int[] arr, int res, int target, int[][] dp){
        //base case
        if(i==arr.length){
            if(res==target) return 1; // 1 valid way
            else return 0; // not a valid way
        }
        if(dp[i][res+sum]!=-1){ //target+sum to get the right index of the target, as we hadled -ve indexing
            return dp[i][res+sum];
        }

        int add = waysMemo(i+1,arr, res+arr[i], target,dp); //adding a number to get result
        int sub = waysMemo(i+1,arr, res-arr[i], target,dp); //subtracting a number to get result

        return dp[i][res+sum] = add+sub;
    }

    public int findTargetSumWaysMemo(int[] arr, int target) {
        // i -> 0 to n-1 | target = target = -sum to sum       ------------IMPORTANT---------- bcz there is a combination of adding all and of subtracting all
        //we can use HashMap for negative indexing OR array from 0 to 2*sum
        //dp[i][res+sum] -> ways(i,res)
        int n = arr.length;
        sum = 0;
        for(int ele : arr) sum+=ele;
        int[][] dp = new int[n][2*sum+1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return waysMemo(0,arr,0,target,dp);
    }

    public static void main(String[] args) {

    }
}
