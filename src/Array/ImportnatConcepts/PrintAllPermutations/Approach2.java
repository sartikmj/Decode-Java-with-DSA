package Array.ImportnatConcepts.PrintAllPermutations;

import java.util.List;
import java.util.ArrayList;

public class Approach2 {
    //    Approach 2
//    We are using a pointer which will swap the current and the right elements from it
//    making the all possible permutations.
//    when the pointers cross the len of array , we will backtrack to the previous state. To find out next permutation.

    public static void recPermutation(int index, int[] nums, List<List<Integer>> ans) {
        //base case, when pointer is out of array
        if (index == nums.length) {
            //copy the ds to ans, we will take the nums and put its elements into ds and add that ds into ans
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(ds);
            return;
        }

        //swapping everything from index to n-1
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums); //swapping the index ele with the curr or right ele
            recPermutation(index + 1, nums, ans); //calling the recPermutation function with the index+1
            swap(i, index, nums); //backtracking
        }
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); //to store all the permutations
        recPermutation(0, nums, ans);// initial index 0, to start with the first element
        return ans;
    }

}
