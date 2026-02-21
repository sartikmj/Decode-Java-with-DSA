package LinkedList.Questions;
//leetcode 86
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        // dummy Nodes
        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);

        ListNode tempA = a;
        ListNode tempB = b;

        ListNode temp = head;

        while(temp!=null){
            if(temp.val<x){
                tempA.next = temp;
                tempA = tempA.next;
            }
            else{ //temp.val<=x
                tempB.next = temp;
                tempB = tempB.next;
            }
            temp = temp.next;
        }
        tempB.next = null; //tempB will always be the last node of the LL,bcz it is LL of ele > x.
        a = a.next;
        b = b.next; //take dummy node pointers to head of the LL
        if(a==null) return b; //when there are no elements smaller than x. then
        tempA.next = b; //tail of A connected to head of B

        return a; //head of the Partitioned LL
    }

    public static void main(String[] args) {}
}
