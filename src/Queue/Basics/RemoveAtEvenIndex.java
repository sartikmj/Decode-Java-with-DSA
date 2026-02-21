package Queue.Basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveAtEvenIndex {
    //Remove Elements at even index in a queue

    //Using Queue , by PWSkills
    public static Queue<Integer> removeAtEvenIndex(Queue<Integer> q){
        Queue<Integer> helper = new LinkedList<>();

        while(!q.isEmpty()){
            q.poll(); //removing even index elements
            if(!q.isEmpty()){
                helper.add(q.poll()); //inserting odd index elements
            }
        }
        while(!helper.isEmpty()){
            q.add(helper.poll());
        }
        return q;
    }

    //Using ArrayList
    public static Queue<Integer> remove(Queue<Integer> q){
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        for(int i=0;i<list.size();i++){
            if(i%2==1){
                q.add(list.get(i));
            }
        }
        return q;
    }

    //Using Queue
    public static Queue<Integer> removeAtEven(Queue<Integer> q){
        Queue<Integer> helper = new LinkedList<>();

        while(!q.isEmpty()){
            helper.add(q.poll());
        }
        for(int i=0;i<helper.size();i++){
            if(i%2==1){
                q.add(helper.poll());
            }
            else helper.poll();
        }
        return q;
    }

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);

        System.out.println(removeAtEvenIndex(q));
    }
}
