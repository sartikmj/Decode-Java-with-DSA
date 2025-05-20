package Queue.Implementation.StackImplementation;

import java.util.Stack;

public class StackImplementation {
    //leetcode 232
//    Implement Queue using Stacks


    //Approach
//    Stack1 (Input Stack), Stack2 (Output Stack)
//    1. We will create an input stack and push all incoming elements
//    2. We will keep an output stack for peek and pop operations.
//    3.whenever we have to pop or peek the element, we will move the elements from input stack to output stack.
//    (to reverse the order)
//    until the output stack is empty we will push new elements from input to output stack.
//
//  TC=O(1) SC=O(N)

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public StackImplementation() {

    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean empty() {
        if (input.isEmpty() && output.isEmpty()) {
            return true;
        }
        return false;
    }
}
