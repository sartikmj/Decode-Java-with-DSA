package LinkedList.Questions;

//leetcode 61
public class RotateList {
//    Approach:
//    first we will use slow and fast pointer , first take fast pointer to k from front
//    then move fast pointer to tail one by one and move slow move pointer one step each until fast.next!=null i.e. fast reach tail
//    now slow is at the one node before from rotation
//    now we will point the node from where to rotate as newHead which is one ahead of slow
//    Now we will point slow.next = null as it is new tail
//    fast is at the tail so ,  fast = head; , now the last node is connected to head
//    now head = newHead to take head to the new head position
//    now the linkedlist is rotated by k steps.

//    take care of the base cases too.
//using fast slow pointers
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        // Base Cases
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        k %= len;
        if (k == 0) {//putting this statement here to resolve k == len condition.
            return head; //if we put this condition above it will give error 0/0 not possible.
        }
        //Logic Begins
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i <= k; i++) { // taking fast at kth term from begining
            fast = fast.next;
        }
        while (fast.next != null) { // taking fast to the tail;
            slow = slow.next; // slow is at the k-1th node
            fast = fast.next; // fast is at the tail
        }
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        head = newHead;

        return head;
    }

    //    Another approach -> normal one
    public ListNode rotateRightByMe(ListNode head, int k) {
        //edge case
        if (head == null || head.next == null) return head;
        ListNode l = head;
        int len = 1;
        while (l.next != null) {
            l = l.next;
            len++;
        }
        k = k % len;
        if (k == 0) return head;
        ListNode temp = head;
        for (int i = 1; i < len - k; i++) {
            temp = temp.next;
        }
        ListNode new_head = temp.next;
        l.next = head;
        temp.next = null;
        head = new_head;
        return head;
    }

}
