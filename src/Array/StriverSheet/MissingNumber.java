package Array.StriverSheet;

import java.util.Arrays;

//leetcode 268
public class MissingNumber {

//    We will calculate the total sum of the n numbers using the formula n(n-1)/2
//    then calculate the sum of all the ele in array, and subtract it from the n number sum, we will get the missing number

    //Optimal
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int TotalSum = (n*(n+1))/2;
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return TotalSum - sum;
    }

//    Brute Force
public int missingNumber1(int[] nums) {
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=i){
            return i;
        }
    }
    return nums.length;
}
}
