package PrefixSum;


import java.util.Arrays;

//Leetcode 2389
public class LongestSubsequenceWithLimitedSum {

//    NOTE- Subsequence mean , the elements do not need to be together in the array they can be taken from any index.

//    first we will sort the array, now we have the smallest elements in the beginning
//    then we will make a prefix sum array from it, we will get the sum till each element
//    now for every element in the original array we will apply binary search in prefix sum array and apply some conditions to get ans

    //TC=O((m+n)logn)
    public int[] answerQueries(int[] arr, int[] queries) {
        Arrays.sort(arr); //sorting
        int n = arr.length;
        //Prefix sum array
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        int m = queries.length;
        int[] ans = new int[m];

        for(int i=0;i<m;i++){
            //Binary Search
            int low = 0, high = n-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[mid]>queries[i]) high = mid - 1;
                else{ //arr[mid]<=queries[i]
                    ans[i] = Math.max(ans[i], mid+1); //mid+1 is length
                    low = mid+1;
                }
            }
        }
        return ans;
    }



}
