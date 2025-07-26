package BinarySearch.Questions;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//Leetcode 658
public class FindKClosestElements {


    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;

        // Edge case: x is smaller than the smallest element
        if (x < arr[0]) {
            for (int i = 0; i < k; i++) ans.add(arr[i]);
            return ans;
        }

        // Edge case: x is greater than the largest element
        if (x > arr[n - 1]) {
            // FIXED: previously wrong loop range (was decreasing index and sorting after)
            // Now directly take the last k elements in correct order
            for (int i = n - k; i < n; i++) ans.add(arr[i]);
            return ans;
        }

        // Binary search to find the lower bound (first index where arr[i] >= x)
        int lb = n;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        //now finding the K closest elements
        // Using two pointers to solve the question ahead
        //put j at the lower bound and i at lower bound - 1 index, bcz lb can be = or > x
        // Start two pointers from left (i) and right (j) of the lower bound
        int i = lb - 1, j = lb;

        // Compare values from both sides and pick the closer one
        while (k > 0 && i >= 0 && j < n) {
            int di = Math.abs(x - arr[i]);
            int dj = Math.abs(x - arr[j]);

            //condition
            if (di <= dj) { //if diff is equal we take the smaller value
                ans.add(arr[i--]);
            } else {
                ans.add(arr[j++]);
            }
            k--;
        }


        // If left pointer still has elements and we still need more
        while (k > 0 && i >= 0) {
            ans.add(arr[i--]); // Correctly accessing value at index i
            k--;
        }


        // If right pointer still has elements and we still need more
        while (k > 0 && j < n) {
            ans.add(arr[j++]); // FIXED: previously added index j by mistake instead of arr[j]
            k--;
        }

        // Final sort since we may have added values from both sides in arbitrary order
        Collections.sort(ans);
        return ans;
    }


    //Optimised

    public List<Integer> findClosestElementsOptimized(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((x - arr[mid]) > (arr[mid + k] - x)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }

}
