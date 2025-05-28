package Queue.Implementation.LinkedListImplementation;

public class LinkedLIstImplementation {

    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = next;
        }
    }

    //The Front most element of the Queue is the head of the LL
    //we also need to have tail here, bcz we need to insert elements at the rear of the queue i.e. the tail of LL
    //whenever we remove the ele the head will move further, whenever we will insert an element the rear will move further

    //head-> for deletion / peek
    //tail-> for insertion / addition

    public static class Queue{
        Node head = null;
        Node tail = null;
        int size=0;

        public void add(int val){
            Node temp = new Node(val);
            if(head==null){ //or size==0
                head = tail = temp;
                size++;
                return;
            }
            tail.next = temp;
            tail = temp;
            size++;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return head.val;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        public void display(){
            if(head==null){ //or size==0 or isEmpty()
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }

        public int size(){
            return size;
        }
    }

    public static void main(String[] args){
        Queue q = new  Queue();

        System.out.println(q.isEmpty());
        System.out.println(q.size());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        q.display();
        System.out.println();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.isEmpty());
        System.out.println();
        q.display();
        System.out.println();
        System.out.println(q.size());
        System.out.println(q.peek());


    }

}
