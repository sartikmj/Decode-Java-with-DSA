package LinkedList.Questions;
//leetcode 206
public class ReverseLL {
    //Iterative is better and more efficient than Recursive


//    we will take three pointers
//    return p , as it is the new head of the reversed LL.

//    TC = O(n) , SC = O(1)
    public static ListNode reverseIterative(ListNode head) {
        //edge cases
        if(head == null || head.next == null) return head;
        ListNode c = head;
        ListNode n = head; //head or null , anyone of them
        ListNode p = null;
        while (c != null) {
            n = c.next;
            c.next = p;
            p=c;
            c = n;
        }
        return p;
    }

//  TC = O(n) , Extra Space = O(n) -> this space is of call stack. <------IMPORTANT------
    public static ListNode reverseRecursive(ListNode head){
        //edge cases
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        //Magic of recursion ->rec will reverse by itself
        ListNode new_head = reverseRecursive(a);
        a.next = head;
        head.next = null;

        return new_head;
    }
}
