package DynamicProgramming.Knapsack;

import java.util.Arrays;

public class SubsetSum {

    //Tell if there exists a subset of the array with sum == target

    //Recursion
    // TC=O(2^n) AS=O(n*t)
    public static boolean subset(int i, int[] arr, int target){
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        boolean skip = subset(i+1,arr,target);
//        if(target-arr[i]<0) return skip; //only valid if all the numbers in the array are positive
        boolean take = subset(i+1,arr,target-arr[i]);
        return take || skip;
    }

    //Memoisaiton
    // -> Like in Knapsack here also you can traverse the array from n-1 to 0 instead of 0 to n-1
    public static boolean subsetMemo(int i, int[] arr, int target, int[][] dp){
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1){
            //we have to do below steps bcz in java 1 and 0 do not convert into true and false
            if(dp[i][target]==1) return true;
            else return false;
        }
        boolean ans = false;
        boolean skip = subsetMemo(i+1,arr,target,dp);
        if(target-arr[i]<0) ans = skip;
        else {
            boolean take = subsetMemo(i+1,arr,target-arr[i],dp);
            ans = take || skip;
        }
//        if(ans==true) dp[i][target] = 1;
//        else dp[i][target] = 0;
//        return ans;

        // OR

        dp[i][target] = ans ? 1 : 0;
        return ans;
    }

    //Memoization -> traversing array from n-1 to 0
    //Exactly same would work in PartitionEqualSubsetSum
    public static boolean subsetMemo2(int i, int[] arr, int target, int[][] dp){
        if(i<0){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1){
            //we have to do below steps bcz in java 1 and 0 do not convert into true and false
            if(dp[i][target]==1) return true;
            else return false;
        }
        boolean ans = false;
        boolean skip = subsetMemo2(i-1,arr,target,dp);
        if(target-arr[i]<0) ans = skip;
        else {
            boolean take = subsetMemo2(i-1,arr,target-arr[i],dp);
            ans = take || skip;
        }
//        if(ans==true) dp[i][target] = 1;
//        else dp[i][target] = 0;
//        return ans;

        // OR

        dp[i][target] = ans ? 1 : 0;
        return ans;
    }


    //Tabulation
    


    public static void main(String[] args) {
        int[] arr = {8,5,2,4};
        int target = 9;
        int n = arr.length;

        // i varying from 0 to n-1
        // target varying from target to 0

        int[][] dp = new int[arr.length][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){

            }
        }

        System.out.println(dp[n-1][target]==1);
//        System.out.println(subsetMemo2(n-1,arr,target,dp));
    }
}
