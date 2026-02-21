package Stack.Basics;

import java.util.Stack;

public class DisplayRecursively {

    public static void displayReverse(Stack<Integer> stack) {
        if(stack.isEmpty()) return;
        System.out.print(stack.pop()+" ");
        displayReverse(stack);
    }

    public static void displayStack(Stack<Integer> stack) {
        if(stack.isEmpty()) return;
        int ele = stack.pop();
        displayStack(stack);
        System.out.print(ele+" ");

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

//        displayReverse(stack); //to print in reverse order
        System.out.println();
        displayStack(stack); //to print in right order
    }
}
