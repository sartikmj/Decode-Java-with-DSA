package BitManipulation.Questions;

//      WATCH THE LECTURE AGAIN FOR BIT MANIPULATION SOLUTION IT WAS HARD AND CONFUSING

import java.util.HashMap;

//leetcode 260
public class SingleNumber3 {

    //SOme methods are
    //Using HashMap
    //Using Sorting


    //Using HashMap
    //TC=O(n) AS=O(n)
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for(int i : map.keySet()){
            if(map.get(i)==1){
                ans[count] = i;
                count++;
            }
        }
        return ans;
    }

    //Bit Manipulation
    //Using XOR and Right Most Set Bit

    //First, take the XOR of the two unique numbers, which is equal to the XOR of all the ele in the array bcz all others appear twice
    //so they will cancel out, and we will get the XOR of the two unique numbers in the array
    //XOR of two numbers is a number and in this numbers all 1s represent the bits in which the bits of both numbers are different


}
