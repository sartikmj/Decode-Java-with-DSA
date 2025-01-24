package LinkedList.DisplayingLinkedList;


public class DisplayingLinkedList {

    public static void print(Node head){
        //we can put the printing code inside this method
        //whichever node you will give as head the elements form it to the last node will be printed.
    }

    public static void main(String[] args) {
        Node a = new Node(10); //head of LL
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        //we will first put temp on the head of linkedlist
        Node temp = a;

        //print value inside temp and take it to the next node , till temp!= null

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
}
