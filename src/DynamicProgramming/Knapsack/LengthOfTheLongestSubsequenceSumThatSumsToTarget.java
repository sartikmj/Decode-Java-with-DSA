package DynamicProgramming.Knapsack;

import java.util.Arrays;
import java.util.List;

//leetcode  2915
public class LengthOfTheLongestSubsequenceSumThatSumsToTarget {

    //My Code

    public int longest(int i, List<Integer> nums, int target, int[][] dp){
        if(i==nums.size()){
            if(target==0) return 0;
            else return Integer.MIN_VALUE/2;
        }
        if(dp[i][target]!=-1) return dp[i][target];
        int skip = longest(i+1,nums,target,dp);
        if(nums.get(i)>target) return dp[i][target] = skip;
        int take = 1 + longest(i+1,nums,target-nums.get(i),dp);

        return dp[i][target] = Math.max(take,skip);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[nums.size()][target+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        int ans = longest(0,nums,target,dp);
        return ans < 0 ? -1 : ans;
    }





//    Step 1:
//    The "capacity" here = target.
//    Instead of maximizing sum, you maximize length of subsequence.
//So your state will depend on:
//    i = index you are at
//    t = remaining target

//    Step 2:
//Ask yourself:
//            👉 “What is the longest subsequence length using nums[i...end] to reach sum t?”
//
//    Choices:
//
//    Skip nums[i] → length = whatever comes from (i+1, t)
//
//    Take nums[i] (only if t >= nums[i]) → length = 1 + (i+1, t - nums[i])
//
//    So recurrence:
//
//    dp[i][t] = max(skip, take)

// Step 3: Base cases
//
//    If t == 0 → valid subsequence found → return 0 length (because we don’t add more).
//
//    If i == nums.length → no elements left:
//
//    If t == 0 → return 0
//
//    Else → return -∞ (invalid, meaning not possible).


    //Memoization
    class Solution {

        //TC=O(n*target), SC=O(n*target)

        public int solve(int i,int[] arr, int target, int[][] dp){
            //Base Cases
            if(target==0) return 0; //bcz we don't add more
            if(i==arr.length){ //reached end of array no elements left
                return -9999; //subsequence does not exist, as target is not 0 and array has ended.
            }

            //checking dp
            if(dp[i][target] != -1) return dp[i][target];

            //skip and take
            int skip = solve(i+1,arr,target,dp);

            int take = Integer.MIN_VALUE; //initialise it here to access it later
            if(target>=arr[i]){
                take = 1 + solve(i+1,arr,target-arr[i],dp);
            }

            return dp[i][target] = Math.max(take,skip);
        }

        public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
            //convert to array
            int[] arr = new int[nums.size()];
            int n = nums.size();
            for(int i=0;i<n;i++){
                arr[i] = nums.get(i);
            }
            int[][] dp = new int[n][target+1];
            for(int i=0;i<dp.length;i++){
                Arrays.fill(dp[i],-1);
            }

            int ans = solve(0,arr,target,dp);

            return ans<0?-1:ans;
        }
    }

    public static void main(String[] args) {

    }
}
