package PrefixSum.Leetcode;

import java.util.HashMap;

// GFG
public class ZeroSumSubArrays {

    public int findSubarray(int[] arr) {
        // code here.
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>(); //prefixsum, freq of that prefsum
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==0) count++;

            if(map.containsKey(sum)){
                count+= map.get(sum);
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
            else map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }

}
