package SlidingWindow.Questions.Striver;

public class MaximumConsecutiveOnes3 {

    //Brute Force -> TC=O(n2), SC=O(1)
//    Generate all the subarrays

    public static int bruteForce(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;
        int len = 0;
        for (int i = 0; i < n; i++) {
            int zeroes = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0) {
                    zeroes++;
                }
                if (zeroes <= k) {
                    len = j - i + 1;
                    maxLen = Math.max(maxLen, len);
                } else {
                    break; //breaks out of the Inner Loop.
                }
            }
        }
        return maxLen;
    }

    // Best One to Learn
    //Better Approach -> TC=O(2n), SC=O(1)
    public int Better(int[] arr, int k) {
        int maxLen = 0, l = 0, r = 0, zeroes = 0, len = 0;

        while (r < arr.length) {
            if (arr[r] == 0) {
                zeroes++;
            }

            while (zeroes > k) {
                if (arr[l] == 0) {
                    zeroes--;
                }
                l++;
            }

            if (zeroes <= k) {
                len = r - l + 1;
                maxLen = Math.max(maxLen, len);
            }
            r++;
        }
        return maxLen;
    }

    //Optimized Approach -> TC=O(n), SC=O(1)
    public int longestOnes(int[] arr, int k) {
        int maxLen=0,l=0,r=0,zeroes=0,len=0,n=arr.length;

        while(r<n){
            if(arr[r]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(arr[l]==0) zeroes--;
                l++;
            }
            if(zeroes<=k){
                len = r-l+1;
                maxLen = Math.max(len,maxLen);
            }
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {

    }
}
