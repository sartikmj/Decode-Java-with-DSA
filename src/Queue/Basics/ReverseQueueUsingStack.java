package Queue.Basics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseQueueUsingStack {
    //poll all the elements from queue and push them into stack
    //then pop all the elements from stack and push them into queue
    public static Queue<Integer> reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();

        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(reverse(q));
    }
}
