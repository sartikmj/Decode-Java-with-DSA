package HeapsAndPriorityQueue.Basics;

import java.util.PriorityQueue;

public class MinHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.remove(); //OR pq.poll() -> removes the topmost or min element
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
    }

}
