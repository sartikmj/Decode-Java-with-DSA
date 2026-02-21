package HashmapsAndHashsets.HashMap.Questions;

import java.util.HashMap;

public class TwoSum {
    //in HashMap we will store Elements as Key and their indexes as Values.
    //for each element in array we will first calc the remaining value after subtracting the ele from target
    //and then check for the remaining in the HashMap as a key
    //if it exists we got the ans, if not insert the value with its index.

    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                ans[0] = i;
                ans[1] = map.get(rem);
                break; //for optimization
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }

}
