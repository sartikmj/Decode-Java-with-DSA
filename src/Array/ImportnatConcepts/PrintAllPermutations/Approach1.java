package Array.ImportnatConcepts.PrintAllPermutations;
import java.util.List;
import java.util.ArrayList;
public class Approach1 {

//    Approach 1
//    we are using recursion to find all the possible permutations of a given array.
//    we will use recursive tree to find all the permutations.

//    TC=O(N!) * N , SC=O(N) + O(N)
    public static void recPermutation(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        //base case for recursion
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds)); //add the arraylist of the current permutation in the final ans
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){ //if the element is not present in the current permutation
                freq[i] = true; //mark the element as present in the current permutation
                ds.add(nums[i]);
                recPermutation(nums,ds,ans,freq);
                //Backtracking , moving back to the previous state to find the next permutation
                ds.remove(ds.size()-1); //removing the last element from the current permutation, as it is the latest to be added and now we are one step back in recursive tree of permutation.
                freq[i] = false; //mark the element as not present in the current permutation
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); //to store all the permutations
        List<Integer> ds = new ArrayList<>(); //to store the current permutation
        boolean[] freq = new boolean[nums.length]; // to store the frequency of each element in the array, to check mark if the element is already present in the permutation.
        recPermutation(nums,ds,ans,freq);
        return ans; //return the final ans with all the permutations.
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }
}
