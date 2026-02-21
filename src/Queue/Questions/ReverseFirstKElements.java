package Queue.Questions;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
//    Given an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.

//    We are using an auxiliary stack.
//    Store first k elements of queue in a stack and pop it from queue.
//    pop these elements from the stack and add back in queue
//    Now poll the n-k elements from q
//    and add it back to the queue.
//    TC=O(N) SC=O(N)

    public static Queue<Integer> reverse(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        //edge case
        if(q == null || k<=0 || k>q.size()){
            return q;
        }

        int n = q.size();
        for(int i=0;i<k;i++){
            st.push(q.poll());
        }
        //or u can use this loop instead of above loop
//        while(k-- > 0){
//            st.push(q.poll());
//        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=0;i<n-k;i++){
            q.add(q.poll());
        }
        return q;
    }

    public static void main(String[] args) {

    }
}
