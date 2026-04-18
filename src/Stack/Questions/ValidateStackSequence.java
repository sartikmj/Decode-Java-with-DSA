package Stack.Questions;

import java.util.Stack;

//Leetcode 946
public class ValidateStackSequence {

//    Algorithm
//    1. we see values in pushed array . Each time we see a value we will push it in stack
//    2. we compare if top of stack matches values in popped array . as long as it getting matched , we keep on popping values from stack
//    and keep incrementing pointer of pop
//    3. At the end , if stack is empty , we return true, else we return false.

//    TC=O(N) -> each element gets pushed or popped maximum one time
//    SC=O(N) -> stack space

    public static boolean validateStackSequence(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j=0;//pointer for popped array

        for(int val : pushed){
            st.push(val);

            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] ars){

    }
}
