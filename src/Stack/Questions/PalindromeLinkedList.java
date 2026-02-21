package Stack.Questions;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeLinkedList {
    //Palindrome LinkedList using Stack

//    First we will traverse the whole LL and store its element in stack
//    Now we will take another pointer at head and traverse it while checking if the st.peek() == pointer.val
//    for a palindrome LL it will be true always , as read from straight or reverse the elements will be same

//    TC=O(N) SC=O(N)

    public static class ListNode{
        int val;
        ListNode next;
    }

    public boolean isPalindrome(ListNode head) {
        //edge case
        if(head==null || head.next==null) return true;

        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        ListNode rev = head;

        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
        }

        while(rev!=null){
            if(rev.val == st.peek()){
                st.pop();
                rev = rev.next;
            }
            else return false;
        }
        return true;
    }

}
