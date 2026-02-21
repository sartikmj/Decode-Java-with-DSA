package LinkedList.Questions;
import java.util.ArrayList;
//Leetcode 23
public class MergeKSortedLists {
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

    //First way I did it myself not optimized but still great.
//    the LL are given in array -> array has head of all LL as element.
//    first we will put them in arraylist
//    then we take last of the LL from the arraylist remove them from arraylist and after merging them add the merged LL in ArrayList.
//    keep on doing it until there is only one element left in arraylist
//    return the head of that one last LL.

    public static ListNode mergeKLists(ListNode[] arr){
        ListNode ans = null; //to store the answer
        ArrayList<ListNode> List = new ArrayList<>();
        //putting the elements of arr into LL
        for(int i=0;i<arr.length;i++){
            List.add(arr[i]);
        }
        //getting the last two LL , removing them from List and merge them and add the merged LL into List
        for(int i=List.size()-1;i>0;i--){ //till only one element left we are not going to perform anything on one element . So, i>0 not i>=0
            ListNode firstHalf = List.get(i);
            ListNode secondHalf = List.get(i-1);
            List.remove(i); //you can also write firstHalf
            List.remove(i-1); //can also write secondHalf

            //merging the two sorted LL
            ans = mergeTwoSortedLists(firstHalf, secondHalf);
            List.add(ans);
        }
        // If no valid lists were present, return null
        return ans; //OR return list.isEmpty() ? null : list.get(0);
    }

    //Optimised Approach using Binary Search
    public static ListNode mergeKLists2(ListNode[] arr){
        return null;
    }

    public static void main(String[] args) {

    }
}
