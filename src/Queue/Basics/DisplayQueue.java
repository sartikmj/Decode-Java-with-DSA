package Queue.Basics;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
//    Print all the elements of a Queue , using STL methods and Extra Queue

    //elements will be lost
    public static void printElements1(Queue<Integer> q) {

        while(!q.isEmpty()) {
            System.out.print(q.poll());
        }
    }

    //Using another Queue
    public static void printElements(Queue<Integer> q) {
        Queue<Integer> helper = new LinkedList<>();
        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x); //OR 1.->System.out.print(q.peek());
            helper.add(x);       // 2.->helper.add(q.poll());
        }
        while(!helper.isEmpty()){
            q.add(helper.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(6);
        q.add(3);
        q.add(9);
        q.add(7);
        q.add(2);
        q.add(6);
        q.add(5);
        q.add(0);
        q.add(1);
        q.add(6);

        printElements(q);
    }
}
