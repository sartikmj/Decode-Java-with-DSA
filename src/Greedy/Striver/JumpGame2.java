package Greedy.Striver;

import java.util.Arrays;

//leetcode 45
public class JumpGame2 {


    //Optimized
    // Greedy Solution
    //we will maintain a range with pointers left and right, right is the farthest we can jump with the ele of our range,
    //and l is the closest we can jump with our range

    public int jump(int[] nums) {
        int jumps = 0;
        int l=0,r=0;
        int n = nums.length;
        while(r<n-1){
            int farthest = 0;
            for(int i=l;i<=r;i++){
                farthest = Math.max(i+nums[i], farthest);
            }
            l = r+1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }




    //DP solution -> TLE error
    // TC=O(n^2) SC=O(n^2)
    public int func(int idx, int jumps,int[] nums, int[][] dp){
        if(idx >= nums.length-1) return jumps;
        if(dp[idx][jumps]!=-1) return dp[idx][jumps];
        int min = Integer.MAX_VALUE;

        for(int i=1;i<=nums[idx];i++){
            min = Math.min(min, func(idx+i,jumps+1,nums,dp));
        }
        return dp[idx][jumps] = min;
    }

    public int jumpDP(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return func(0,0,nums,dp);
    }



}
