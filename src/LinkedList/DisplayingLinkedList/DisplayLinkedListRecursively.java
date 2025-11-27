package LinkedList.DisplayingLinkedList;

public class DisplayLinkedListRecursively {

    public static void displayRecursively(Node head){
        if(head == null) return; //base case
        System.out.println(head.val);
        displayRecursively(head.next);
        //to print the LL in reverse order just switch the above two lines of the code.
    }

    public static void main(String[] args){
        Node a = new Node(10); //head of LL
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayRecursively(a);
    }

}
