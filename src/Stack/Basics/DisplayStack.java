package Stack.Basics;

import java.util.Stack;

public class DisplayStack {
//    TC = O(N)
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st); //1st

        while(!st.isEmpty()){ //2nd
            System.out.println(st.pop());
        }
    }
}
