package HashmapsAndHashsets.HashSet.Questions;

import java.util.HashSet;

//Leetcode 2442
public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public int reverse(int n){
        int r = 0; //reversed number
        while(n!=0){
            r = r*10 + n%10;
            n/=10;
        }
        return r;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
}
