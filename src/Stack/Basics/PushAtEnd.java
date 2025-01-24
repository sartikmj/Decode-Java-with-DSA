package Stack.Basics;

import java.util.Stack;

public class PushAtEnd {
    //Push at bottom

    public static void main(String[] args) {
        //insert at end
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        int newElement = 10;
        System.out.println(st);

        Stack<Integer> temp = new Stack<>();

        while(!st.empty()){
            temp.push(st.pop());
        }

        st.push(newElement);

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
