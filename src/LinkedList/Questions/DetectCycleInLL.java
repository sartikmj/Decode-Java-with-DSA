package LinkedList.Questions;
//leetcode 414
public class DetectCycleInLL {
    //if you can not reach the null in the linkedlist it means that it has a cycle.

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null  ){
            fast = fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
//    we can also move fast with fast.next.next.next it will also work, but we also have to give another condition in while then
//    while(fast!=null && fast.next!=null && fast.next.next != null) to avoid null pointer next error , we can also
//    take fast 4 steps ahead but then also we have to add one more condition in the successive order.

    public static void main(String[] args) {

    }
}
