package HeapsAndPriorityQueue.Questions;

import java.util.Arrays;
import java.util.PriorityQueue;

//Leetcode 215
public class KthLargestElement {

    //Same logic as Kth Smallest Element and same TC
//    TC=O(nlogk) ,  Auxillary Space = O(k)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //MinHeap
        for(int ele : nums){
            pq.add(ele);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }

    // Another
    public int findkthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
