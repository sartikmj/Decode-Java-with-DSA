package Array.StriverSheet;

import java.util.Arrays;
import java.util.List;

public class NextPermutation {

//    Brute Force
//    find all permutation, store them in a Data Structure, Linear search the ds for the given perm, if u found it then
//    then next ele of ds is the next permutation.
//    if the perm is the last ele then the first ele of ds is the next permutation.

//    No better approach, Only optimal approach

//    Optimal Approach

    public static void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        //find breaking point
        for(int i=n-2;i>=0;i--){ //breaking point can be from second last ele
            if(nums[i]<nums[i+1]){
                idx = i; // A or breaking point or dip
                break;
            }
        }
        //edge case if there is no dip / breaking point
        if(idx == -1){
            reverse(0,n-1,nums);
            return;
        }

        //find smallest ele > A
        for(int i=n-1;i>idx;i--){
            if(nums[idx]<nums[i]){
                swap(i,idx,nums); //even after swapping the arr after breaking point will be sorted
                break;
            }
        }

        //reversing remaining right elements from the dip
        reverse(idx+1,n-1,nums);
        //we got the next permutation hurrayyy!!!
    }

    public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int i,int j, int[] arr){
        while(i<j){
            swap(i,j,arr);
            i++;j--;
        }
    }
}
