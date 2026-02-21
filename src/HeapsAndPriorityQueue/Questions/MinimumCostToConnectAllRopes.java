package HeapsAndPriorityQueue.Questions;

import java.util.PriorityQueue;

public class MinimumCostToConnectAllRopes {

//    NOTE:- IF you add in a way adding bigger ropes first you will get max cost
//    if you add in a way adding smaller ropes first you will get min cost
public static int minCost(int[] arr) {
    if(arr.length==1) return 0;
    //MinHeap
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int ele : arr){
        pq.add(ele);
    }
    int minCost = 0;
    while(pq.size()>1){
        int x = pq.remove();
        int y = pq.remove();
        pq.add(x+y);
        minCost += (x+y);
    }
    return minCost;
}
}
