package SlidingWindow.Concept;


// Find the Subarray of size K with max Sum


public class MaximumSumSubarrayOfSizeK {


//    Sliding Window
//    TC=O(n)
//    we will use two pointers one at the starting of window and one at the ending of the window and they will move together
//    with the window

//    IMPORTANT
//    Two consecutive windows of size 'k' have 'k-1' elements common
//    so instead of iterating again on window to find the sum of the window what we can do it
//    sum = sum-arr[i-1]+arr[j]

    public int maxSubArray(int[] arr, int k) {
        int i=0;
        int j=k-1;
        int n = arr.length;
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int a=i;a<=j;a++){// k times, or you can write int a = 0; a<=k-1; a++
            sum+=arr[a];
        }
        i++;j++;
        while(j<n){ // n-k times
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(maxSum, sum);
            i++;j++;
        }
        System.out.println(maxSum);
        return maxSum;
    }


//      Brute Force
//    Generate all the substring of size 3 and calculate their sum and keep a track of the starting index of the max sum subarray

    //TC=O(N*K) if k is close to n TC will be n^2
    public static int BruteForce(int[] arr, int k) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        //loop will run till n-k
        for(int i=0;i<n-k+1; i++){
            int sum=0;
            //loop will run till i+k-1
            for (int j = i; j < i+k; j++) {
                sum+=arr[j];
            }
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println(maxSum);
        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k = 3;
        BruteForce(arr, k);
    }
}
