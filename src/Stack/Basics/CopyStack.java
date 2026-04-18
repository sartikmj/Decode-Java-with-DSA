package Stack.Basics;

//Copy stack into another stack in same order.

import java.util.Stack;

public class CopyStack {
    //we will use 3 stack

//    TC=O(n) SC=O(n)
    public static void main(String[] args) {
        Stack<Integer> sti = new Stack<Integer>();
        sti.push(1);
        sti.push(2);
        sti.push(3);
        sti.push(4);
        sti.push(5);
        System.out.println(sti);

        Stack<Integer> temp = new Stack<>();

        while(!sti.isEmpty()){
            temp.push(sti.pop());
        }
        System.out.println(temp);

        Stack<Integer> stf = new Stack<>();

        while(!temp.isEmpty()){
            stf.push(temp.pop());
        }

        System.out.println(stf);
    }
}
