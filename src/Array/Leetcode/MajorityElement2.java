package Array.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//leetcode 229
public class MajorityElement2 {

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i)>n/3) ans.add(i);
        }
        return ans;
    }
}
