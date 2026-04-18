package Stack.Basics;
import java.util.Stack;

//Reverse the stack

public class ReverseStack {
    // TC = O(n) -> we pop elements from original stack and push in the reverse stack.
    // SC = O(n), for auxiliary space -> we are taking an extra stack
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        Stack<Integer> rst = new Stack<>();

        while(!st.empty()){
            rst.push(st.pop());
        }

        System.out.println(rst);
    }
}

