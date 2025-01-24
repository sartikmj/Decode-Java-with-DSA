package LinkedList.Questions;

//leetcode 2095


public class DeleteTheMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null ||head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;

    }

    public ListNode sirSol(ListNode head){
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        int mid=0;
        if(head.next==null){ //Single Element LinkedList
            return null;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            mid++;
            fast=fast.next.next;
        }
        for(int i=1;i<=mid-1;i++){
            temp = temp.next;
        }
        temp.next = slow.next;
        return head;
    }
    public static void main(String[] args) {

    }
}
