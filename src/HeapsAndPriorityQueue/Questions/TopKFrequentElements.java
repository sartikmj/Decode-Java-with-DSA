package HeapsAndPriorityQueue.Questions;
import java.util.*;

//Leetcode 347
public class TopKFrequentElements {

    public class Pair implements Comparable<Pair> {
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }

        //comparator
        public int compareTo(Pair p){
            return this.freq - p.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1); //freq map
        }

        //MinHeap
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int key : map.keySet()){
            pq.add(new Pair(key, map.get(key)));
            if(pq.size()>k) pq.remove();
        }
        int[] arr = new int[k];

        for(int i=0;i<arr.length;i++){
            Pair p = pq.remove();
            arr[i] = p.ele;
        }

        return arr;
    }
}
