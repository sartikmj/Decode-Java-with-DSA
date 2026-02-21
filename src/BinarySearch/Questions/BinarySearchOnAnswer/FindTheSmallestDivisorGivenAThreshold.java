package BinarySearch.Questions.BinarySearchOnAnswer;


//Leetcode 1283
public class FindTheSmallestDivisorGivenAThreshold {

    public boolean isLess(int mid, int[] arr, int t) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % mid == 0)
                sum += arr[i] / mid;
            else
                sum += arr[i] / mid + 1;
        }
        if(sum<=t) return true;
        else return false;
    }

    //TC=O(log max)
    public int smallestDivisor(int[] arr, int t) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int d = 0;
        int low = 1, high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isLess(mid, arr, t)) {
                d = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return d;
    }

}
