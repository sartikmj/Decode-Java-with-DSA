package Stack.Questions;

import java.util.Stack;

//leetcode 20
public class BalancedBrackets {

//    By Kanishka Mam

//    First we will iterate through the string and
//    when found a opening bracket store it's corresponding closing bracket to the stack
//    we will keep storing the corresponding closing brackets of the opening brackets found while traversing
//    when we found the closing bracket we will check if the  bracket at the top of stack is the same closing bracket
//    if it is then we will just remove that from stack, and moving on
//    but closing bracket found is different than the bracket on the top of the stack or the stack is empty
//    we will return false
//    when we reach the end of the string then we will check if the stack is empty or not if it is empty we will return true
//    else false

//    NOTE:- Content inside balanced brackets should also be balanced

//    TC=O(n) , SC = O(n)
    public static boolean balancedBrackets(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                st.push(')');
            else if (c == '{')
                st.push('}');
            else if (c == '[')
                st.push(']');
            else if (st.isEmpty() || st.pop() != c) {
                return false;
            }

        }
        return st.isEmpty();
    }

    //Simplified Version of the above code
    public static boolean balancedBracketsSimplified(String s){
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c=='(') st.push(')');
            else if(c=='{') st.push('}');
            else if(c=='[') st.push(']');

                //in case of closing brackets
            else if(st.isEmpty()) return false;
            else if(st.pop()!=c) return false;
        }
        if(st.isEmpty()) return true;
        else return false;
    }

//    By Raghav Sir

    //in case there are only rounded brackets
    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='('){
                st.push(ch);
            }
            else{ //ch==')'
                if(st.size()==0) return false;
                if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        if(st.size()>0) return false;
        else return true;
    }

    public static void main(String[] args) {
        String s = ") ()(())()";
        System.out.println(balancedBrackets(s));
        System.out.println(isBalanced(s));
        System.out.println(balancedBracketsSimplified(s));
    }
}
