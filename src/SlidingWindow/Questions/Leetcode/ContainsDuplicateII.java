package SlidingWindow.Questions.Leetcode;
import java.util.*;

//219. Contains Duplicate II
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;

            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
