package DynamicProgramming.Knapsack;

//leetcode 416
public class PartitionEqualSubsetSum {

    //HINT-> If there is a subset whose sum is equal to the half of the total sum, then sum of the other left elements will
    // also be equal

    //Just check if the subset have sum equal to total sum/2

    private boolean subset(int i, int[] arr, int target, int[][] dp){
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1) return dp[i][target]==1;
        boolean ans = false;
        boolean skip = subset(i+1,arr,target,dp);
        if(target-arr[i]<0) ans = skip;
        else{
            boolean pick = subset(i+1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        dp[i][target] = ans ? 1:0;
        return ans;
    }

    //Memoization
    //TC=O(n*target) AS=O(n*t)
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int ele : nums) sum+= ele;
        if(sum%2!=0) return false; //if the sum of elements is odd it is not possible to divide it into tow parts with equal sum

        //we can reduce the question that we find subset with sum = totalsum/2, bcz the other part will also have the same sum automatically


        int target = sum/2;
        int[][] dp = new int[nums.length][target+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++) dp[i][j] = -1;

        return subset(0,nums,target,dp);
    }

    //Memoization -> traversing in reverse order
    // traversing fron n-1 to 0 instead of 0 to n-1
    private boolean subset2(int i, int[] arr, int target, int[][] dp){
        if(i<0){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1) return dp[i][target]==1;

        boolean ans = false;
        boolean skip = subset2(i-1,arr,target,dp);
        if(target-arr[i]<0) ans = skip;
        else{
            boolean pick = subset2(i-1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        dp[i][target] = ans ? 1:0;
        return ans;
    }

    //Tabulation

    public boolean canPartitionTabu(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int ele : arr) sum+= ele;
        if(sum%2!=0) return false;
        int target = sum/2;

        int[][] dp = new int[n][target+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++){ // j in place of target in the loop
                boolean ans = false;
                boolean skip = i>0 ? dp[i-1][j]==1 : j==0;

                if(j-arr[i]<0) ans = skip;
                else{
                    boolean pick = i>0 ? dp[i-1][j-arr[i]] == 1 : j==0;
                    ans = pick || skip;
                }
                dp[i][j] = ans ? 1 : 0;
            }

        return dp[n-1][target]==1;
    }

    public static void main(String[] args) {

    }
}
