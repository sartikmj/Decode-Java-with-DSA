package LinkedList.Questions;

//leetcode 19
public class RemoveNthNodeFromBackOfLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //edge cases
        if (head.next == null)
            return null; // for single node list
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        // special edge case for removing head
        if (n == len)
            return head.next;

        ListNode x = head;
        // nth from end = len-n+1 th node from the begining , but we need len-n th node
        // to delete it
        for (int i = 1; i <= len - n - 1 ; i++) {
            x = x.next;
        }
        //deletion
        x.next = x.next.next;
        return head;

    }

    //using slow-fast approach

    //set f and s at head
    //move f n steps ahead
    //Move slow and fast together at the same speed till fast!=null , slow will get to one element before the nth element from back.
    public ListNode removeNthFromEnd2(ListNode head, int n){
        ListNode slow=head;
        ListNode fast = head;
        //move fast n steps
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        // edge case
        if(fast == null){ //n==length
            //I have to delete the head
            return head.next;
        }
        //move slow and fast together until fast reaches tail , bcz we have to take slow one node before the target node
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {

    }
}
