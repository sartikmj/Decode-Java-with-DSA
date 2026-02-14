package Array.StriverSheet;

import java.util.*;

//leetcode 18
public class FourSum {

    //Brute Force
    // TC=O(n^4) SC=O(number of quads)*2
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        long sum = nums[i];
                        sum+=nums[j];
                        sum+=nums[k];
                        sum+=nums[l];

                        if(sum==target){
                            List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(list);
                            ans.add(list);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }


}
