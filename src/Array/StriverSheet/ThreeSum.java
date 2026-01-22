package Array.StriverSheet;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//leetcode 15
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){

            //skipping duplicated
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //skipping duplicates
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right] == nums[right-1]) right--;

                    //skip the last duplication
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{ //sum>0
                    right--;
                }
            }
        }
        return ans;
    }
}
