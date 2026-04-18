package Array.Leetcode;

import java.util.HashMap;

// leetcode 525
public class ContiguousArray {

    // take 0 as -1 and the question turns into the longest subarray with sum 0.
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]==0)sum+=-1; //instead you can also directly do map.put(0,-1);
            else sum+=1;

            if(sum==0){
                maxLen = Math.max(maxLen, i+1);
            }
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen,len);
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
