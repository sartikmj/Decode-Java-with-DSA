package SlidingWindow.Questions;

//Leetcode 209
public class MinimumSizeSubarraySum {

    //  Sliding Window
    public int minSubArrayLen(int k, int[] arr) {
        int i=0,j=0,n=arr.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        while(j<n){
            sum+=arr[j];

            while(sum>=k){
                minLen = Math.min(minLen,(j-i+1));
                sum-=arr[i];
                i++;
            }
            j++;
        }
        return minLen==Integer.MAX_VALUE? 0: minLen;
    }


    //Brute Force
//    TC=O(n^2)
    public int minSubArrayLen1(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int length = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= target) {
                    length = j - i + 1;
                    minLength = Math.min(minLength, length);
                    break;
                }
            }
        }
        if (minLength == Integer.MAX_VALUE) return 0;
        return minLength;
    }
}
