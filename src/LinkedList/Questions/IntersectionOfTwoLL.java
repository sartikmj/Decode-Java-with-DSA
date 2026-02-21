package LinkedList.Questions;

//leetcode 160
public class IntersectionOfTwoLL {
//    Hint: 1.Calculate lengths of A and B (A and B are two linkedlist which we are checking).
//    2.Difference of lengths.
//    3.We have to put the temp of Longer LL where the remaining length of both LL is equal.

//    Approach:
//      First we will calculate the length , then check whose length is greater and smaller.
//    for the LL with smaller length its temp will be left(chhod denge) at its head
//    for the LL with greater length its temp will be moved forward by the difference of their lengths number of times.
//    then apply while loop till tempA!=tempB , loop jab tk dono temp equal na aa jaye
//    the moment both temp get equal return that node return tempA or tempB .
//    if there is no intersection both temp will reach null and get equal and null will be returned.

    public static ListNode intersection(ListNode headA, ListNode headB) {
        //calculating the length
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lenA = 0;
        int lenB = 0;
        while (tempA != null) {
            tempA = tempA.next;
            lenA++;
        }
        while (tempB != null) {
            tempB = tempB.next;
            lenB++;
        }
        tempA = headA;
        tempB = headB; //putting both temp back to the heads

        //taking the temp of LL with greater length to the equal length of smaller LL
        if (lenA > lenB) {
            for (int i = 1; i <= lenA - lenB; i++) {
                tempA = tempA.next;
            }
            //now both temp are at equal distance
        }
        else {
            for (int i = 1; i <= lenB - lenA; i++) {
                tempB = tempB.next;
            }
            //now both temp are at equal distance
        }
        //now running loop till both temp are at equal Node and then return that node
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA; //returning the interesection Node .
    }

    public static void main(String[] args) {

    }
}
