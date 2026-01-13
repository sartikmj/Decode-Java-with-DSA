package HeapsAndPriorityQueue.Questions;
import java.util.*;

//Leetcode 1046
public class LastStoneWeight {

    //Brute Force
    //use arraylist and sorting
    //TC=O(n^2logn)
    public int lastStoneWeightBrute(int[] stones){
        List<Integer> arr = new ArrayList<>();
        for(int ele : stones){
            arr.add(ele);
        }
        while(arr.size()>1){
            Collections.sort(arr);
            int y = arr.remove(arr.size()-1);
            int x = arr.remove(arr.size()-1);
            if(y!=x) arr.add(y-x);
        }
        if(arr.size()==0) return 0;
        return arr.get(0);
    }

    //Optimal
    //Use priority queue
//    TC=O(nlogn)
    public int lastStoneWeight(int[] stones) {
        //MaxHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele:stones){
            pq.add(ele);
        }

        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();

            if(x!=y){
                pq.add(x-y);
            }
            else{

            }
        }
        if(pq.isEmpty()) return 0;
        return pq.peek();
    }

}
