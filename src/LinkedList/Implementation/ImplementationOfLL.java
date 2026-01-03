package LinkedList.Implementation;

// Making user-defined Data Structure
//LinkedList , this Data Structure that we have created we will treat it like an object.

//we also need to make Node class ,but it is already have been made.

//class Node{
//    int val;
//    Node head;
//    Node(Node head){
//        this.head = head;
//    }
//}

//we can name this data structure anything like LL
class LinkedList { //User defined Data Structure , so it will have data members and functions.
    Node head; //both head and tail are accessible to all the methods
    Node tail; //both head and tail by default are on null.
    int size; //size of LL by default set to 0. used to maintain the size of the LL
//these three are prefered to be set private so that they can only be accessed inside the class

    //methods

    //method to insert a node at the end of LL
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) { //LL is empty , head and tail both pointing at the same node
            head = temp;
            tail = temp;
            //OR , you can also write like this
//            head = tail = temp;
        } else { //if LL is not empty
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    //method to display LL
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //method to get size of LL
    void size() {
        System.out.println("Length of the LinkedList is : " + size);
    }

    //method to insert Node at the begining of LL
    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    //method to insert a Node at a particular index.
    void insert(int idx, int val) {
        Node temp = new Node(val);
        Node x = head;
        //Base Cases
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtEnd(val);
            return;
        }
        if (idx > size || idx < 0) {
            throw new RuntimeException("Index out of bounds"); //no need to return now.
        }

        for (int i = 1; i < idx; i++) { //loop starting from 1 bcz x is already on 0.
            x = x.next;
        }
        //insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int getElement(int idx) throws Error {
        //Base Cases
        if (idx == size - 1) return tail.val; //this is optional it just saves some time
        if (idx > size || idx < 0) throw new Error("Index out of bounds");

        Node temp = head;
        for (int i = 1; i <= idx; i++) { //we are getting element at that index so loop will run till the index.
            temp = temp.next;
        }
        return temp.val;
    }

    void setElement(int idx, int val) {
        //Base Cases
        if (idx == size - 1) { //this is optional this just save some time complexity at a particular case
            tail.val = val;
        }
        if (idx > size || idx < 0) {
            throw new RuntimeException("Index out of bounds");
        }

        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }

        temp.val = val;
    }

    void deleteAtHead() {
        head = head.next;
        size--;
    }

    void deleteTail() {
    }

    void deleteAtIndex(int idx) {
        //Base Cases
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (idx > size || idx < 0) {
            throw new RuntimeException("Index out of bounds");
        }

        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) { //reach at node idx-1 to delete node at idx
            temp = temp.next;
        }
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }
}

public class ImplementationOfLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); //a new LL is declared , list is the name and its data structure is LinkedList.

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.display();
        list.insertAtHead(60);
        list.display();

        list.insert(2, 100);
        list.display();
        list.insert(5, 80);
        list.display();
        list.setElement(1, 99);
        list.display();
//        System.out.println(list.getElement(-1));
        System.out.println();
        list.display();
        System.out.println(list.tail.val);
        list.deleteAtIndex(7);
        list.display();
        System.out.println(list.tail.val);

    }
}

