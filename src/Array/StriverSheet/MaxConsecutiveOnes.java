package Array.StriverSheet;

public class MaxConsecutiveOnes {

    //    Optimal
    public int findMaxConsecutiveOnes(int[] arr) {
        int ans = 0;
        int ones = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                ans = Math.max(ans, ones);
                ones = 0;
            } else ones++;
        }
        ans = Math.max(ans, ones);
        return ans;
    }

    //    Better
    public int findMaxConsecutiveOnes1(int[] arr) {
        int i = 0, j = 0, n = arr.length;
        int ones = 0;
        int ans = 0;
        while (j < n) {
            if (arr[j] == 1) {
                ones++;
                ans = Math.max(ans, ones);
            } else {
                ones = 0;
                i = j;
            }
            j++;
        }
        return ans;
    }
}
