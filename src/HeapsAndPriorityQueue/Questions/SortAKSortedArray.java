package HeapsAndPriorityQueue.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortAKSortedArray {
    //OR Sort a nearly sorted array

    //Min or Max any heap can be used you have to check it

    //here min heap will be used as we have to sort
    //we will restrict the size of minheap at k
    //logic is almost same as smallest kth element.

//    NOTE:- if u want is ascending order MinHeap is used.

    //TC=O(nlogk)
    //with using another array.
    public static List<Integer> sort(int[] nums, int k,  List<Integer> ans) {
        //instead of using new array, we can also overwrite in same array it will be fine.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : nums){
            pq.add(ele);
            if(pq.size() > k){
                ans.add(pq.poll()); // nlogk
            }
        }
        //after the loop ends there will still be elements left inside heap.
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;
    }

    //Inplace
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int j=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                arr[j] = pq.poll();
                j++;
            }
        }
        while(!pq.isEmpty()){
            arr[j] = pq.poll();
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        List<Integer> ans = new ArrayList<>();
        sort(arr,k,ans);
        System.out.println(ans);
    }
}
