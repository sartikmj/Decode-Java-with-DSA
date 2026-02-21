package LinkedList.Questions;

//Leetcode 2130
public class MaxTwinSumOfaLL {

    //You can use iterative version for reversing LL it is faster, or to make even more faster use iterative method
    //for reversal in the main code do not make different method.
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode a = head.next;
        ListNode newHead = reverseList(a);
        a.next = head;
        head.next = null;
        return newHead;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseList(slow);

        ListNode t = head;
        int max = Integer.MIN_VALUE;
        while(slow!=null){
            int sum = t.val + slow.val;
            max = Math.max(sum,max);
            slow = slow.next;
            t=t.next;
        }
        return max;
    }
}
