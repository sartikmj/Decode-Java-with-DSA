package PrefixSum.Leetcode.Hard;

import java.util.HashMap;

// leetcode 974
public class SubarraySumDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, map.getOrDefault(0,0)+1);
        for(int i=0;i<n;i++){
            sum+=nums[i];

            int rem = (sum % k + k) % k; // to handle negative remainders
            // In this pattern we check and put in map sum%k, bcz the base of comparison is Remainder
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
