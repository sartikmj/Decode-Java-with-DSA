package DynamicProgramming.OneDimensionalDP;

import java.util.Arrays;

//Leetcode 198
public class HouseRobber {

    // Recursive Code

    public int amount(int[] nums, int i) {
        if (i >= nums.length) return 0; // base case
        int take = nums[i] + amount(nums, i + 2); //taking and skipping next adjacent house
        int skip = amount(nums, i + 1); //skipping and going to next house

        return Math.max(take, skip);
    }

    public int rob(int[] nums) {
        return (amount(nums, 0));
    }

    //Memoization

    public int amount(int[] nums, int i, int[] dp) {
        if (i >= nums.length) return 0; //base case
        if (dp[i] != -1) return dp[i];
        int take = nums[i] + amount(nums, i + 2, dp);
        int skip = amount(nums, i + 1, dp);

        return dp[i] = Math.max(take, skip);
    }

    public int robMemo(int[] nums) {
        // n varies form 0 to n-1
        //dp[i] will store the value of amount(i)
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return (amount(nums, 0, dp));
    }

    //Tabulation
    public int robTabu(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
//                            take           skip
        }
        return dp[n-1];
    }

}
