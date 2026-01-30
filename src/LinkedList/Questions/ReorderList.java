package LinkedList.Questions;

public class ReorderList {
    public static ListNode reverse(ListNode head){
        while(head==null||head.next==null) return head;
        ListNode c = head;
        ListNode p = null;
        ListNode n = head;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }

    //My Solution
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){ //left middle
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode left = slow;
        ListNode right = slow.next;

        left.next = null;
        right = reverse(right);

        ListNode t1 = head;
        ListNode t2 = right;

        //join alternatively
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        while(t1!=null && t2!=null){
            t.next = t1;
            t1 = t1.next;
            t=t.next;
            t.next = t2;
            t2 = t2.next;
            t=t.next;
        }
        if(t1==null) t.next = t2;
        else t.next = t1;

        head = dummy.next;
    }
}
