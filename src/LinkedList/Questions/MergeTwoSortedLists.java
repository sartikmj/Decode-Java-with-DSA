package LinkedList.Questions;
//leetcode 21
public class MergeTwoSortedLists{

    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); //dummy Node
        ListNode t = dummy;
        ListNode t1 = list1;
        ListNode t2 = list2;

        while(t1!=null && t2!=null){
            if(t1.val <= t2.val){
                t.next = t1;
                t1=t1.next;
            }
            else{ //when t2.val > t1.val
                t.next = t2;
                t2 = t2.next;
            }
            t=t.next;
        }
        if(t1==null) t.next = t2;
        else t.next = t1; //when t2==null

        return dummy.next; //bcz dummy.next is the head of the merged LL
    }

    public static void main(String[] args) {

    }
}
