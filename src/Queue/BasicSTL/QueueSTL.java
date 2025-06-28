package Queue.BasicSTL;

//NOTE
// Stack collection framework is a Class which is a subclass of class Vector , Stack can also be used with Deque implementation
// Queue collection framework is an Interface , which is why it is needed to be implemented by LinkedList, PriorityQueue, ArrayDeque, ConcurrentLinkedQueue
// Queue is an Abstract Datatype
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class QueueSTL {
    public static void main(String[] args) {
        //instantiation of Queue

        Queue<Integer> q1 = new ArrayDeque<>();
        //OR You can also use
        Queue<Integer> q = new LinkedList<>();

        //insert element at the end of the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q);

        q.remove(); //removes element from the start or beginning of the queue

        System.out.println(q);

        System.out.println(q.peek()); //returns the element at the beginning of the Queue
        //or
        System.out.println(q.poll());

        System.out.println(q.size()); //returns the size of Queue
    }
}
