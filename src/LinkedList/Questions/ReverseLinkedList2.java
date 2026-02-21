package LinkedList.Questions;
//leetcode 92

//-----> THERE ARE SO MANY EDGE CASES TAKE CARE OF THEM <--------------------
public class ReverseLinkedList2 {

    public static ListNode reverse(ListNode head){
        while(head==null||head.next==null) return head;
        ListNode c = head;
        ListNode p = null;
        ListNode n = head;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;

    }

    // TC = O(n) , SC = O(1)
    // This solution is 2 pass
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next == null) return head;
        ListNode temp = head;
        // traverse the whole LL and mark a b c d , a node before left , b node is left,
        // c node is right , d node after right , its a sorted LL
        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;
        int pos = 1; //to keep
        while(temp!=null){
            if(pos==left-1) a = temp;
            if(pos==left) b = temp;
            if(pos==right) c = temp;
            if(pos==right+1) d = temp;
            temp = temp.next;
            pos++;
        }
        //now we the part of LL we have to reverse is b to c , so now we will seperate that part
        // into a seperate LL

        if(a!=null) a.next = null; //if left will be the first element then a will be at null hance
        // will give null pointer error
        if(c!=null) c.next = null;

        // now using reverse method we will reverse b to c LL
        c = reverse(b); //now c becomes the head of that LL and we are again storing it in c
        // bcz reverse method is returning a ListNode.

        if(a!=null) a.next = c;
        b.next = d;
        if(a==null) return c;
        return head;
    }

    public static void main(String[] args) {

    }
}
