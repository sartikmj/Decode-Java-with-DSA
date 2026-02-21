package LinkedList.Questions;

//Leetcode 328
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        ListNode o = new ListNode(-1);
        ListNode e = new ListNode(-1);

        ListNode temp = head;
        ListNode t1 = o;
        ListNode t2 = e;
        int idx = 1;
        while (temp != null) {
            if(idx%2!=0){
                t1.next = temp;
                t1 = t1.next;
            }
            else{
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;
            idx++;
        }
        t2.next = null;
        t1.next = e.next;

        ListNode newHead = o.next;

        return newHead;
    }
}
