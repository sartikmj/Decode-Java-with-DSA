package PrefixSum;

//Leetcode 2640
public class FindTheScoreOfAllPrefixesOfAnArray {

    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        int[] conv = new int[nums.length];
        long[] score = new long[nums.length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            conv[i] = nums[i] + max;
        }

        //now for score just prefix sum the conv array
        score[0] = conv[0];
        for(int i=1;i<n;i++){
            score[i] = (long)conv[i] + (long)score[i-1];
        }

        return score;
    }
}
