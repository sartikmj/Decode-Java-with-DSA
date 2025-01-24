package LinkedList.Questions;
//leetcode 142
public class Cycle2InLL {
//    first we will take two pointers slow and fast move slow with one step and fast with two step .
//    there will be a point where they both will meet and stop.
//    -------IMPORTANT-------
//    now we will take another pointer t and start it from head.
//    we will move and s one step one by one first s then t.
//    the point where they both will meet is the point or the node which forms the cycle.

//    REMEMBER THIS ALGORITHM


//    there is a concept of self loop , as if there is a single node and it has a self loop,this code will also work on it.

    public ListNode mySolutionDetectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode t = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(t!=slow){
                    slow=slow.next;
                    t=t.next;
                }
                return t;
            }
        }
        return null;
    }

    // Sir Solution
    public ListNode detectCycle(ListNode head) {
        // Base case
        if (head == null || head.next == null)
            return null; // for empty or single node LL
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
// loop will break either when there is a cycle or not a cycle
        if(fast!=slow) return null;
        ListNode t = head;
        while(t!=slow){
            slow=slow.next;
            t=t.next;
        }
        return t;
    }

    public static void main(String[] args) {

    }
}
