package Greedy;

import java.util.Arrays;

public class MaximizeSumOfArray {

    //We have to apply greedy bcz every time we are taking the smallest number out of all in the array

    //We have to choose the smallest in the array always so we should keep the array sorted

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int i=0;
        while (i < nums.length && nums[i] < 0 && k > 0) {
            nums[i] = -nums[i];
            i++;
            k--;
        }
        Arrays.sort(nums);
        if(k%2==1)
            nums[0]=-1*nums[0];
        for(int n:nums)
            sum+=n;
        return sum;
    }


}
