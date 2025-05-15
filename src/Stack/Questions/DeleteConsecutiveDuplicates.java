package Stack.Questions;
import java.util.Stack;

// Leetcode 1047
public class DeleteConsecutiveDuplicates {
//    we will create a stack and put characters of string inside it based on a condition
//    if the stack is empty or the top most element in stack does not match with the character we will push the character of the string
//    in the stack
//    if we the top most character in the stack match with the character of the string then we will pop() that character from the stack
//    at the end we will make a StringBuilder and pop() all the ele from stack and store them to String Builder
//    then we will reverse the sb bcz elements taken from stack are in reverse order
//    then convert the sb into String bcz sb can not be converted into String by itself and we have to return the string
//    and hence return the answer.

//    TC=O(n) , SC=O(N)

    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack();

        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            }
            else st.push(c);
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        String ans = sb.reverse().toString(); //reversing the sb and then converting it to string

        return ans;
    }

    public static void main(String[] args) {

    }
}
