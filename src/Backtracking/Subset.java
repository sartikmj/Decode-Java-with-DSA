package Backtracking;

import java.util.ArrayList;
import java.util.List;

//leetcode 78
public class Subset {

    // Another method is using Bit Manipulation check it in the Bit Manipulation Package

    public void helper(int i , int[] nums, ArrayList<Integer> ans, List<List<Integer>> arr){
        if(i==nums.length){
            ArrayList<Integer> list = new ArrayList<>(); //to store the ans list, bcz arraylist is pass by reference.
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        helper(i+1,nums,ans,arr); // not take
        ans.add(nums[i]); //adding the element
        helper(i+1,nums,ans,arr); //take
        ans.remove(ans.size()-1); //remove the element we added
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0,nums,ans,arr);
        return arr;
    }
}
