package Array.StriverSheet;


//Longest Subarray with given Sum K(Positives)

public class LongestSubarrayWithSumKWithPositives {

    //Brute Force   --> works for both Arrays with Positive and Negative Integers
    //TC=O(N^3) SC=O(1)
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int len = 0;
        //find each subarray using nested loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                //now we have a subarray from i to j , now we will run a loop to find sum of the subarray
                for (int a = i; a <= j; a++) {
                    sum += arr[a];

                    //checking if the sum is equals to the target sum of subarray
                    if (sum == k) {
                        len = Math.max(len, j - i + 1); //checking the longest subarray with sum k,length of a subarray with sum k between
                        // i and j is j-i+1
                    }
                }
            }

        }
        return len;
    }

    //Better Brute Approach
    //TC=o(N2) SC=O(1)

    //instead of traversing array again and again to find the subarray
    //we will just add the next element to sum of the elements of the previous sub array

    public static int longestSubarray2(int[] arr, int k) {
        int n = arr.length;
        int len = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j]; //adding the next element to sum of previous subarray

                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    //Better Approach is using Hashset , will do in future after learning Hashset
    //This Better approach is the most optimal code if array contains both positive and negative integers


    //Optimal Approach  --> Only if the array includes Positive Integers
    //Two Pointer and Greedy Approach

//    we will use two pointer , start from 0 , if the sum is less than k we will keep moving one pointer ahead
//    when the sum==k we will store the length , then moving the first pointer the sum > k
//    when sum > k we will move the second pointer further , until sum>k
//    if sum get equal to k we will store the length
//    moving 2nd pointer ahead the sum will be less than k , then we will move the first pointer ahead .
//    we will do it till the 1st pointer is less than arr.length

    public static int longestSubarray3(int[] arr, int k) {
        int n = arr.length;
        int len = 0;
        int left = 0;//first pointer
        int right = 0;//second pointer
        int sum = arr[0]; //initially sum will be 0th element of the array as both pointers start from 0th element
        while (right < n) {
            while(left<=right && sum>k){ //till there is a subarray and sum>k
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                len = Math.max(len, right-left+1);
            }
            right++;
            if(right<n) sum+=arr[right]; //base case only add if right < n
        }
        return len;
    }

    public static void main(String[] args) {


    }
}
