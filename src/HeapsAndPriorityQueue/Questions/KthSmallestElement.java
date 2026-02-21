package HeapsAndPriorityQueue.Questions;

import HeapsAndPriorityQueue.Basics.MinHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    //Brute Force TC=O(k*n)
//    1. Sort the array with Bubble/insertion and then find kth smallest
//    2. Selection sort with k passes return arr[k-1]


    //Better TC=O(nlogn) SC=O(logn) or O(n)
//    1. use Built-in sort or Merge/Quick Sort, and then get ar[k-1] element.

//    2.use minHeap, insert all elements in it, and remove k-1 times then peek u will get kth smallest element.

//        PriorityQueue<Integer> pq = new PriorityQueue<>(); //MinHeap
//        for(int ele:arr){ // adding: TC=O(nlogn) , bcz of rearrangement.
//            pq.add(ele);
//        }
//        //removing: TC=O(klogn), bcz k elements are removed.
//        for(int i=1;i<=k-1;i++){
//            pq.poll();
//        }
//
//        //total TC=O(klogn + nlogn) = O(nlogn)
//        System.out.println(pq.peek());
//
//        //But we can already do it using merge / quick sort.
//    }


    //Optimal -> Using MaxHeap
//    Restrict the size of maxHeap to k.
//    keep inserting ele in MaxHeap and check the size if size gets greater than k
//    if size > k remove the topmost ele and keep inserting , keep doing it until the array is traversed
//    after the array is traversed the topmost element in MaxHeap is the Kth smallest ele.

    public static int  findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek(); //TC= add->O(nlogk), remove->O((n-k)logk)
        //Total TC=O((2n-k)logk) -> approx : TC=O(nlogk).
//        Auxillary Space = O(k)
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=3;

        int ans = findKthSmallest(arr,k);
        System.out.println(ans);
    }
}
