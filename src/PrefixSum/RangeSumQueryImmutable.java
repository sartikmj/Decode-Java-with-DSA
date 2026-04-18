package PrefixSum;

import java.util.Arrays;

//Leetcode 303
public class RangeSumQueryImmutable {

    class NumArray {
        int[] arr;

        public NumArray(int[] nums) { //Constructor
            arr = Arrays.copyOf(nums, nums.length); //deep copy
            //OR arr = nums //shallow copy

            //making the array prefix sum
            for (int i = 1; i < nums.length; i++) {
                arr[i] += arr[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0) return arr[right];
            return arr[right] - arr[left - 1];
        }
    }

/**
 * TC for prefix sum array = O(n)
 * TC for handling m queries = O(m)
 * Overall TC = (n+m) , SC = O(n), Auxilary Space = O(n)-> bcz of extra array we made deep copy you can make it O(1) by making just a shallow copy.
 * if you had followed traditional method of using loop every time you will get TC = O(n*m).
 * n is length of array and m is number of queries
 */

}
