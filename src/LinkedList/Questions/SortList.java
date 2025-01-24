package LinkedList.Questions;


import ArrayList.Implementation.ArrayList;
import java.util.Collections;

// ----------------IMPORTANT---------------------------
//for finding right middle in even length LL condition is fast!=null ,  to find left middle the condition is fast.next!=null
public class SortList {
//    Using merge sort algorithm

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

    public static ListNode sortList(ListNode head) {
        //Base Case
        if(head == null || head.next == null) return head;
        ListNode firstHalf = head;
        ListNode slow = head;
        ListNode fast = head;
        //1st Dividing the LL into two parts
        while(fast.next != null && fast.next.next != null){ //for odd length , for even length(Left Middle)
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        //Magic of recursion
        firstHalf =  sortList(firstHalf);
        secondHalf = sortList(secondHalf);
        //both part of LL are sorted now

        //merging the sorted LL
        ListNode ans = mergeTwoSortedLists(firstHalf,secondHalf);
        return ans;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(30);
        ListNode b = new ListNode(80);
        ListNode c = new ListNode(10);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(0);
        ListNode f = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;



    }
}
