package Stack.Questions.YoutTubeLoveBabbar;
import java.util.Stack;
public class PushAtBottom {

    //by using additional array


    public static void pushAtBottom(Stack<Integer> st,int x){
        //base case
        if(st.isEmpty()){ //when the stack is empty push x
            st.push(x);
            return;
        }

        int num = st.peek();
        st.pop();

        //recursive call
        pushAtBottom(st,x);

        st.push(num);

        return;
    }
}
