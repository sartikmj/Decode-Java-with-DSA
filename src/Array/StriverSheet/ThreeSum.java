package Array.StriverSheet;

import java.util.*;

//leetcode 15
public class ThreeSum {

    //Brute Force
    // Using set to store the final ans so that we do not get duplicate triplets in the ans.
    // TC=O(n^3) SC= 2*O(number of triplets)
    public List<List<Integer>> threeSumBrute(int[] nums) {
        int n = nums.length;
//        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = new ArrayList<>(); //list of triplet
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        //we need unique triplets not duplicates
                        set.add(list); //HashSet auto removes duplicates
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    //Better
    // TC=O(n^2), SC=O(n^2), AS=O(n) -> HashSet
    // The third element k = -(arr[i] + arr[j])
    public List<List<Integer>> threeSumBetter(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
                List<Integer> list = new ArrayList<>();
                int k = -(nums[i] + nums[j]);
                if(set.contains(k)){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(k);

                    Collections.sort(list);
                    ans.add(list);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }


    //Optimized
    // we will start with i=0, j=1, and k will always be at the end of the i.e. k=n-1

    //TC=O(nlogn) + O(n^2) , SC=O(number of unique triplets)
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){

            //skipping duplicate
            if(i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = n-1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{ // sum==0
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(list);
                    j++;
                    k--;

                    while( j<k && nums[j]==nums[j-1]) j++; //skipping duplicates
                    while( j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }

}
