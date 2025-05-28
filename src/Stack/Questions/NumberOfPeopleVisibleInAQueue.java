package Stack.Questions;

public class NumberOfPeopleVisibleInAQueue {

//    Algo:
//    You can see the next right greater element
//    Your left greater element can see you

//    Steps:
//    1.We create a stack and push indices on the stack
//    2.Each time we see a new element (E), we see height (A) at index which is at the top of the stack
//    3.If A < E ,i.e. ht of the index at top of stack is less than the current element
//    mean the current element is taller , so we have to update the ans of A by one and since current element is taller it will block
//    all other elements for top of stack element (A), so it's ans is final and we can pop it from stack.
//    we keep doing this until the top of stack index height is less than current element
//    4.If stack is empty it means we don't have any left greater element for current element
//    If stack is not empty it means current element has next left greater element and it can see it , so we need to update ans for
//    stack top element

    public static void main(String[] args) {

    }
}
