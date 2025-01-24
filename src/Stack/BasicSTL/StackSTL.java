package Stack.BasicSTL;

import java.util.Stack;

public class StackSTL {
    public static void main(String[] args) {
        //Declaration
        Stack<Integer> st = new Stack<>();

        //pushing values into stack
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);

        System.out.println(st.isEmpty());

        //printing the stack
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());

        //to access first element inserted in stack --> TC = O(n);
        while(st.size()>1){
            st.pop();
        }
        //size has become 1
        System.out.println(st.peek()); //first element inserted.
    }
}
