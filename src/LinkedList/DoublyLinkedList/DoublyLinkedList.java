package LinkedList.DoublyLinkedList;

class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}

public class DoublyLinkedList {

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void printReverse(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
    }

    public static void display(Node node){ //any node
        Node temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        //now we are at head
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;

        b.prev = a;
        c.prev = b;
        d.prev = c;

        display(c);
    }
}
