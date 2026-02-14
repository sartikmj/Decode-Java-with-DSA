package LinkedList.DoublyLinkedList.Implementation;

class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }
}

//HW: Make set method

class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (size == 0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (size == 0) head = tail = temp;
        else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }

    public void insert(int idx, int val) { //place x and y at idx-1 and idx
        Node newNode = new Node(val);
        Node x = head;
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size){
            insertAtTail(val);
            return;
        }
        if(idx<0 || idx>size){
            System.out.println("Invalid index");
            return;
        }
        for (int i = 1; i < idx; i++) {
            x = x.next;
        }
        Node y = x.next;
        x.next = newNode;
        y.prev = newNode;
        newNode.next = y;
        newNode.prev = x;
        size++;
    }

    public void deleteAtHead() {
        if(size == 0) throw new RuntimeException("List is empty");
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteAtTail() {
        if(size == 0) throw new RuntimeException("List is empty");
        tail = tail.prev;
        tail.next = null;
    }

    public void deleteAtIndex(int idx) {
        if(size == 0) throw new RuntimeException("List is empty");

        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (idx == size-1) {
            deleteAtTail();
            return;
        }
        Node x = head;
        for(int i = 1; i < idx; i++) {
            x = x.next;
        }
        Node y = x.next.next;
        x.next = y;
        y.prev = x;
//        OR
//        x.next = x.next.next;
//        x = x.next;
//        x.prev = x.prev.prev;
        size--;
    }



    public class Implementation{
    }
}
