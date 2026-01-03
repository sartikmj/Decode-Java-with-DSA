package Greedy.Striver;

//leetcode 55
public class JumpGame {

    //TC=O(n) SC=O(1)
    public boolean canJump(int[] nums) {
        int maxIdx = 0; //max index that you can reach.
        for(int i=0;i<nums.length;i++){
            if(i>maxIdx) return false; // we can't reach i and hence the end
            maxIdx = Math.max(maxIdx, i+nums[i]);
            if(maxIdx>nums.length) return true; //for optimization
        }
        return true;
    }
}
