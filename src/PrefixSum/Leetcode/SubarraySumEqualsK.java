package PrefixSum.Leetcode;

import java.util.HashMap;

//leetcode 560
public class SubarraySumEqualsK {

    // TC=O(n) SC=O(n)
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>(); // sum, frequemcy
        int sum = 0;
        int count = 0;
        // for 0
        map.put(0, map.getOrDefault(0,0)+1);

        for(int i=0;i<n;i++){
            sum+=nums[i];

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
            else{
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
        }
        return count;
    }
}
