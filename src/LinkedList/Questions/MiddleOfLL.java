package LinkedList.Questions;

// Leetcode 876
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

// TC = O(n)
// SC = O(1)

public class MiddleOfLL {

    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length=0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }

        ListNode x = head;
        for(int i=1;i<=length/2;i++){
            x = x.next;
        }
        return x;
    }

//    One pass solution without finding the length of the LinkedList
//    Slow-Fast approach
//   1. Initialization: Start two pointers, slow and fast, both pointing to the head of the linked list.
//   2. Traversal: Move fast two steps at a time and slow one step at a time.
//   3. End Condition: Stop when fast becomes null(for Even length condition) or fast.next(for Odd Length condition) is null.
//   Result: The slow pointer will point to the middle node of the linked list.

    //NOTE: fast!=null condition will come before fast.next!=null condition, or it will give runtime error.
//    this problem will come from Even length LL if the fast.next!=null is written before fast!=null bcz if fast is at null
//    then null.next will generate error.
//    if we write fast!=null this condition will be checked that null!=null , and fast.next!=null i.e. null.next!=null will never be checked for fast being at null.
//    hene , Even length condition will be written before Odd length condition.

    public static ListNode middleNode2(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next; //Move fast two steps
            slow = slow.next; //Move slow one step
        }
        return slow;
    }

    public static ListNode middleNode3(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        int mid = len/2 + 1; //works for both even and odd length
        temp = head;
        for(int i=1;i<=mid-1;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}

//for finding left middle use fast=fast.next.next.next;
