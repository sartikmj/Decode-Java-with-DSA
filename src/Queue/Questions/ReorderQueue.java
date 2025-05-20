package Queue.Questions;

import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    //Interleave the First Half of the Queue with Second Half

    //Approach
//    1. Move the 1st half of the Queue to stack
//    2. Empty the stack to into queue
//    3. Move 1st half (2nd half of initial) of queue into Stack
//    4. One by one add st.pop() and q.pop() to queue
//    5. Reverse the q using stack. you will get the reordered queue

    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<>();

        int n = q.size();

        for(int i=0;i<n/2;i++){
            st.push(q.poll());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        for(int i=0;i<n/2;i++){
            st.push(q.poll());
        }

        for(int i=0;i<n/2;i++){
            q.add(st.pop());
            q.add(q.poll());
        }

        while(!q.isEmpty()){
            st.push(q.poll());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        return q;
    }
}
