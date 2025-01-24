package LinkedList.Questions;
//leetcode 83
public class RemoveDuplicateFromSortedLL {
    public ListNode deleteDuplicates(ListNode head) {
        //Base Cases
        if(head==null) return head;
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
