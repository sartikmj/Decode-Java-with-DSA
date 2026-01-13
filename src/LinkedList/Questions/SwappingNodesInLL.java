package LinkedList.Questions;

//leetcode 1721
public class SwappingNodesInLL {
    public ListNode swapNodes(ListNode head, int k) {
        //edge cases
        if(head==null || head.next==null);
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        ListNode x = fast;
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        //swapping the values
        int temp = slow.val;
        slow.val = x.val;
        x.val = temp;

        return head;
    }

    public static void main(String[] args) {

    }
}
