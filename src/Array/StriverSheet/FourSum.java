package Array.StriverSheet;

import java.util.*;

//leetcode 18
public class FourSum {

    //Brute Force
    // TC=O(n^4) SC=O(number of quads)*2
    public List<List<Integer>> fourSumBrute(int[] nums, int target) {
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

    //Better Method -> We will find the fourth ele == target - (sum of the other three elements)
    // TC=O(n^3) SC=O(n)
    public List<List<Integer>> fourSumBetter(int[] nums, int target) {
        int n = nums.length;
        HashSet<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                HashSet<Integer> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    long four = (long) target - nums[i] - nums[j] - nums[k];

                    if (four >= Integer.MIN_VALUE && four <= Integer.MAX_VALUE
                            && seen.contains((int) four)) {

                        List<Integer> temp = Arrays.asList(
                                nums[i], nums[j], nums[k], (int) four);

                        Collections.sort(temp);
                        ans.add(temp);
                    }

                    seen.add(nums[k]);

                }
            }
        }
        return new ArrayList<>(ans);
    }

    //Optimal Method
    //TC=O(n^3), SC=O(Number of quads), but not using any extra space

    //1. sort the array
    //2. fix two pointers and move two pointers
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue; //skipping duplicates
            for(int j = i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue; //skipping duplicates

                int k = j+1;
                int l = n-1;

                while(k<l){
                    long sum = nums[i];
                    sum+= nums[j];
                    sum+= nums[k];
                    sum+= nums[l];

                    if(sum==target){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                    else if(sum < target) k++;
                    else l--; //sum>target
                }
            }
        }
        return ans;
    }


}
