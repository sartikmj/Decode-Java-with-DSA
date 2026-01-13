package LinkedList.Implementation;

//Implementation of Node
class Node{
    int val;
    Node next; // next is not just the address of next node , it's the whole next node itself ,  as there no concept of address in java

    //Constructor
    Node(int val){
        this.val = val;
    }
}

public class ListNodeClass {
    public static void main(String[] args) {
        //Creating nodes
        Node a = new Node(10); //new node created
        System.out.println(a); //it will print the address of the node a
        //without initialising the next of the node it will store a default value null.
        System.out.println(a.next);

        //to print the value inside node a
        System.out.println(a.val);

        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        //linking nodes
        a.next = b; //Node b is connected to Node a , as a.next is b , a node holds the address of the node b
        //linking: a-> b OR 10->20
        b.next = c; //10->20->30
        c.next = d; //10->20->30->40
        d.next = e; //10->20->30->40->50


        //printing b and a.next will give the same memory address
        System.out.println(b);
        System.out.println(a.next);

        //last node contain next address as null.


        //printing all the values of linkedlist manually
        System.out.println(a.val);
        System.out.println(b.val);// b.val = a.next.val
        System.out.println(c.val);// c.val = a.next.next.val
        System.out.println(d.val);// d.val = a.next.next.next.val
        System.out.println(e.val);// e.val = a.next.next.next.next.val

        System.out.println();
        //OR
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);

    }
}
