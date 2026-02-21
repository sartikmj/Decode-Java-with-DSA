package Stack.Questions.YoutTubeLoveBabbar;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            //if opening bracket stack push
            //if closing bracket , top stack check and pop

            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                //for closing brackets
                if(!st.isEmpty()){
                    char top = st.peek();

                    if(ch==')' && st.peek()=='('
                            || ch=='}' && st.peek()=='{'
                            || ch==']' && st.peek()=='['
                    ){
                        st.pop();
                    }
                    else return false;
                }
                else return false;
            }
        }

        if(st.isEmpty()) return true;
        else return false;

    }

    //Better and Easier Way
    public boolean isValid1(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='('){
                st.push(')');
            }
            else if(c=='{'){
                st.push('}');
            }
            else if(c=='['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty(); //if stack is empty it's balanced
    }
}
