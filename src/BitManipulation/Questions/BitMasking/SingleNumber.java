package BitManipulation.Questions.BitMasking;

import java.util.Arrays;
import java.util.HashMap;

//leetcode 136
public class SingleNumber {

    //Brute Force TC=O(N^2) AS=O(1)
    //use nested loops to check every number if you find a number is not repeated return that number

    //Better Method TC=O(nlogn) AS=O(nlogn)
    //Sort the array , and then check the adjacent two number, if any two are different return that number
    public int singleNumber1(int[] nums) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]) return nums[i];
        }
        //if no element found it means the last number is the single number
        return nums[nums.length-1];
    }

    //Better Method - 2 TC=O(n) AS=O(n)
    // Using HashMap make a freq map and return the key with 1 value
    public int singleNumber2(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i)==1) return i;
        }
        return 0;
    }

    //Optimal
    //Using Bit Manipulation
    //Using XOR operator TC=(n) AS=O(1)

    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i : nums){
            a = a ^ i; // a ^= i
        }
        return a;
    }
}
