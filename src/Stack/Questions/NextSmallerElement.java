package Stack.Questions;

import java.util.Stack;

public class NextSmallerElement {

    public static int[] nextSmallerElement(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=-1;
            }
            else{ //st.peek()<arr[i]
                nse[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nse;
    }
}
