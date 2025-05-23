package LinkedList.DisplayingLinkedList;

//a class made inside a package can be accessed in any class or public inside the same package
//Node class can directly be accessed in other classes of the package
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class TempNode {
    public static void main(String[] args) {
        //shallow copy of a node / reference node -> temp node
        //temp node is used to traverse the linkedlist

        Node a = new Node(100);
        Node temp = a; //shallow copy of a
        //temp is have all the access of a
        //temp is pointing at node a
        //both will have same address

        //Node temp = new Node(a) //deep copy of a
        //temp is a new node itself ,both will have different address

        //temp can be used to modify a
        temp.val = 10; //it will update the value of a to 10
        System.out.println(a.val);
    }
}
