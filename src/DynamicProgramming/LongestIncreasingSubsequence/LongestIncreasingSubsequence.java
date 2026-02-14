package DynamicProgramming.LongestIncreasingSubsequence;

//leetcode 300
public class LongestIncreasingSubsequence {

    //This code is important bcz it tells what is max Longest Increasing Subsequence ending with nums[i]

    //dp[i] represents the max length of the subsequence ending with character at nums[i]

    //TC=O(n^2) AS=O(n)
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i])
                    dp[i] = Math.max(dp[i],dp[j]);
            }
            dp[i] += 1; // as every ele is a subsq of length 1, so counting it
            max = Math.max(max,dp[i]); //to find the final ans the Longest Inc Subsq, the max dp[i]
        }
        return max;
    }
}
