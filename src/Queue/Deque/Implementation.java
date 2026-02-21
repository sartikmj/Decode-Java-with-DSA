package Queue.Deque;

public class Implementation {
    //Implemented using Doubly Linked List

    public static class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static class Deque{
        Node front=null;
        Node rear=null;
        int size=0;

        public void insertFront(int val){
            Node temp = new Node(val);
            if(front==null){ //or size==0
                front = rear = temp;
                size++;
                return;
            }
            temp.next=front;
            front.prev = temp;
            front = temp;
            size++;
        }

        public void insertRear(int val){
            Node temp = new Node(val);
            if(rear==null){
                front = rear = temp;
                size++;
                return;
            }
            rear.next = temp;
            temp.prev = rear;
            rear = temp;
            size++;
        }

        public void deleteFront(){
            if(front==null){ //or size==0
                System.out.println("Underflow, Queue is empty");
                return;
            }
            front = front.next;
            if(front == null){ //Deque is Empty
                rear = null;
            }
            else{
                front.prev = null;
            }
            size--;
        }

        public void deleteRear(){
            if(rear==null){
                System.out.println("Underflow, Queue is empty");
                return;
            }
            rear = rear.prev;
            if(rear == null){
                front = null;
            }
            else{
                rear.next = null;
            }
            size--;
        }

        public int getFront(){
            if(front==null){
                System.out.println("Underflow, Queue is empty");
                return Integer.MIN_VALUE;
            }
            return front.val;
        }

        public int getRear(){
            if(rear==null){
                System.out.println("Underflow, Queue is empty");
                return Integer.MIN_VALUE;
            }
            return rear.val;
        }

        public boolean isEmpty(){
            return size==0;
        }

        public int size(){
            return size;
        }
    }
}
