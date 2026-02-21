package Stack.Questions.YoutTubeLoveBabbar;

import java.util.Stack;

public class SortStack {
    public static void sortedInsert(Stack<Integer> stack , int num){
        //Base Case
        if(stack.isEmpty() || stack.peek() < num){
            stack.push(num);
            return;
        }

        int n = stack.pop();

        //Recursive Call
        sortedInsert(stack,num);

        stack.push(n);
    }

    public static void sortStack(Stack<Integer> stack) {
        // Write your code here.
        if(stack.isEmpty()){
            return;
        }

        int num = stack.pop();

        sortStack(stack);

        sortedInsert(stack,num);
    }
}
