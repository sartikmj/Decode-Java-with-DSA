package DynamicProgramming.LongestIncreasingSubsequence;

public class MinimumNumberOfRemovalsToMakeMountainArray {

    //We can also frame this question as
    // Largest Possible length of Mountain Array after removals

    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;

        //Longest Increasing Subsequence from Left to Right
        int[] dp1 = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    dp1[i] = Math.max(dp1[i], dp1[j]);
            }
            dp1[i] += 1;
        }

        //Reverse Longest Increasing Subsequence from right to left
        int[] dp2 = new int[n];
        for (int i = n-1; i >= 0; i--) {
            for (int j = i+1; j < n; j++) {
                if (nums[j] < nums[i])
                    dp2[i] = Math.max(dp2[i], dp2[j]);
            }
            dp2[i] += 1;
        }

        int maxLen = 0;

        for(int i=0;i<n;i++){
            if(dp1[i]>1 && dp2[i]>1){ //IMPORTANT -> jinka dp 1 hai we will not consider them
                int len = dp1[i] + dp2[i] - 1; // length of mountain array
                maxLen = Math.max(maxLen,len);
            }
        }
        if(maxLen<3) return 0;

        return n-maxLen;
    }


}
