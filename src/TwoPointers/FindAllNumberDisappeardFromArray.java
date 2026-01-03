package TwoPointers;
import java.util.*;

public class FindAllNumberDisappeardFromArray {

    //Using Frq Array -> Optimal
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] freq = new int[nums.length+1];
        List<Integer> ans = new ArrayList<>();

        for(int i : nums){
            freq[i]++;
        }

        for(int i=1;i<nums.length+1;i++){
            if(freq[i]==0) ans.add(i);
        }
        return ans;
    }

    //using Hashset
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)) ans.add(i);
        }

        return ans;
    }
}
