package Stack.Basics;

import java.util.Stack;

public class PushAtIndex {
//    TC=O(n) SC = O(n)
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int index = 2;
        int ele = 50;

        Stack<Integer> temp = new Stack<>();

        while(stack.size()>=index){
            temp.push(stack.pop());
        }
        stack.push(ele);

        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        System.out.println(stack);
    }
}
