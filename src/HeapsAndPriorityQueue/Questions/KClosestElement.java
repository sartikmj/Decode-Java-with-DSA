package HeapsAndPriorityQueue.Questions;
import java.util.*;

//ALSO do it with Binary Search.

//leetcode 658
public class KClosestElement {
    //we will check the difference between the element and other elements of arr those with the least difference are closest.
    //it can also be possible the number itself it not present in the array.

    //CLOSENESS -> a,b,x => a is closer to x if |x-a| < |x-b| and if |x-a|==|x-b| then if a < b, a is closer and vice versa.

    //we will use MaxHeap.

    //We need to insert a pair in the Heap wich have Element and its difference from the x.
    //we will also make a comparable to compare on the basis of difference from x.

    //Pair Datatype
    public class Pair implements Comparable<Pair> {
        int ele;
        int diff;

        Pair(int ele, int diff) {
            this.ele = ele;
            this.diff = diff;
        }

        //Comparator
        //if diff is equal , sort on the basis of ele
        //otherwise sort on the basis of diff
        public int compareTo(Pair p) {
            if (this.diff == p.diff) {
                return this.ele - p.ele;
            }
            return this.diff - p.diff;
        }
    }

//    TC=O(nlogk)
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //MaxHeap
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
        for (int ele : arr) {
            int diff = Math.abs(x - ele);
            pq.add(new Pair(ele, diff));
            if (pq.size() > k)
                pq.remove();
        }
        List<Integer> ans = new ArrayList<>();
        while (pq.size() > 0) {
            Pair p = pq.remove();
            ans.add(p.ele);
        }
        Collections.sort(ans);
        return ans;
    }
}
