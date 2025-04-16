package Stack.Implementation.LinkedListImpementation;

public class LinkedListImplementation {

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int x) { //no need to check if the stack is full or not advantage of LinkedList implementation
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        int peek() {
            if (head == null) {
                return -1;
            }
            return head.val;
        }

        boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        void display(){
            displayRec(head);
        }

        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.display();
        System.out.println();
        System.out.println(st.size());
    }
}
