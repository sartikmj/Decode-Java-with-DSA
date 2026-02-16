package Array.StriverSheet;

import java.util.HashMap;

public class LargestSubarrayWithZeroSum {

//    Brute Force
//    TC=O(n^2) SC=O(1)
    int maxLengthBrute(int arr[]) {
        // code here
        int n = arr.length;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0) maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }

    //Optimal
//    TC=O(nlogn) SC=O(n)
    int maxLength(int arr[]) {
        // code here
        int n = arr.length;
        int maxLen = 0;

        HashMap<Integer,Integer> map = new HashMap<>(); // PrefixSum, Index

        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) maxLen = Math.max(maxLen,i+1); //till index i, length is i+1
            //if zero appears for first time you still want to store it in the map
            if(map.containsKey(sum)){
                int len = i - map.get(sum); // not +1, bcz the subarray start from map.get(sum) + 1 index (imp remember)
                maxLen = Math.max(maxLen,len);
            }
            else{
                map.put(sum,i);
            }
        }

        return maxLen;
    }
}
