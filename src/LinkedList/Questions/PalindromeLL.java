package LinkedList.Questions;

import java.util.ArrayList;

public class PalindromeLL {
    //Brute Force 0
//    for every ith Node travel to len-ith node and check if they are equal or not
//    TC=(n^2)


    //Brute Force 1
//    Push all the elements of the LL in ArrayList and then check the palindrome ny two pointers
// TC = O(n) , SC = O(n)
//    TC is can not be improved further but SC can be optimised
    public static boolean BruteForce1(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int i=0;
        int j = list.size()-1;
        while (i < j) {
            if (!(list.get(i).equals(list.get(j)))) {
                System.out.println("Not a palindrome");
                return false;
            }
        }
        return true;
    }

    //BruteForce 2
//    Create a Deep Copy of the given LL
//    reverse the deep copy
//    now traverse both while checking if the elements are equal or not
//    TC=O(n)  SC=O(n)

    public boolean BruteForce2(ListNode head) {
        //Creating a Deep Copy of the LinkedList
        ListNode newHead = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = newHead;
        while(t1!=null){
            ListNode temp = new ListNode(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
            //Deep Copy created
        }
        //Now we have to reverse the Deep Copy
        newHead = ReverseLL.reverseIterative(newHead); //Use iterative it is better than recursive

        //Now traverse both LL and check if the elements are equal or not
        t1 = head;
        t2 = newHead;
        while(t1!=null){ //can also write t2!=null , both will null together
            if(t1.val!=t2.val) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }


//    Method 3 - > Most Optimized and IMPORTANT appraoch
// --> REVERSE THE SECOND HALF of LL
//    Find middle of the LL then reverse the second half of the LL
//    then traverse the first half and second half till the pointer of second half reach null
//    keep checking if the values are same or not if they are return true if not return false

    public static ListNode reverse(ListNode head) {
        // edge cases
        if (head == null || head.next == null)
            return head;
        ListNode c = head;
        ListNode n = head; // head or null , anyone of them
        ListNode p = null;
        while (c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }

    public boolean isPalindrome(ListNode head) {
        //find middle of the LL or right middle
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        //we got the middle now reverse the second half
        ListNode j = reverse(slow);
        //second half of the LL is reversed now

        //now we will traverse the first half and second half
        ListNode i = head; //so first half start from i and second half start from j

        while(j!=null){
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
}
