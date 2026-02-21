package SlidingWindow.Questions;

// leetcode 1248
public class CountNumberofNiceSubarrays {

    //Three Pointer Sliding Window
    // By Neetcode

    // We will have 3 pointers right left and middle, first we will inc right until we have all the required odd numbers
    // then we will inc the middle until we get to the first odd number
    // in res we will add res = middle - left + 1.
    // then we will inc right until we get another odd number
    // now we will move the left pointer until we have again the required number of odd numbers
    // and move the middle to where left is
    //

    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0;
        int odd = 0;
        int l = 0, m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                odd++;
            }
            while (odd > k) {
                if (nums[l] % 2 == 1) odd--;
                l++;
                m = l;
            }
            if (odd == k) {
                while (nums[m] % 2 == 0) { // jab tk odd nahi aa jata
                    m++;
                }
                res += m - l + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
