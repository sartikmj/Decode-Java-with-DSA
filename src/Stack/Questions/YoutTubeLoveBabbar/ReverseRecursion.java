package Stack.Questions.YoutTubeLoveBabbar;

import java.util.Stack;

public class ReverseRecursion {
    class Solution
    {
        public static Stack<Integer> pushAtBottom(Stack<Integer> st,int x){
            //base case
            if(st.isEmpty()){ //when the stack is empty push x
                st.push(x);
                return st;
            }

            int num = st.peek();
            st.pop();

            //recursive call
            pushAtBottom(st,x);

            st.push(num);

            return st;
        }

        static void reverse(Stack<Integer> st)
        {
            //base case
            if(st.isEmpty()){
                return;
            }

            int num = st.pop();

            reverse(st);

            pushAtBottom(st,num);
        }
    }
}
