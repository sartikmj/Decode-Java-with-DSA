package Stack.Questions.YoutTubeLoveBabbar;
import java.util.Stack;

public class MiniCostToMakeStringValid {
//    Ninja has been given a string ‘STR’ containing either ‘{’ or ‘}’. 'STR’ is called valid if all the brackets are balanced. Formally for each opening bracket, there must be a closing bracket right to it.
//    For Example:
//            “{}{}”, “{{}}”, “{{}{}}” are valid strings while “}{}”, “{}}{{}”, “{{}}}{“ are not valid strings.
//Ninja wants to make ‘STR’ valid by performing some operations on it. In one operation, he can convert ‘{’ into ‘}’ or vice versa, and the cost of one such operation is 1.
//Your task is to help Ninja determine the minimum cost to make ‘STR’ valid.
//For Example:
//Minimum operations to make ‘STR’ =  “{{“ valid is 1.
//In one operation, we can convert ‘{’ at index ‘1’ (0-based indexing) to ‘}’. The ‘STR’ now becomes "{}" which is a valid string.
//        Note:
//Return -1 if it is impossible to make ‘STR’ valid.

    public static int findMinimumCost(String str) {
        // odd condition
        if(str.length() % 2 == 1) {
            return -1;
        }

        Stack<Character> st = new Stack<>();  // Properly initialized Stack

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '{') {
                st.push(ch);
            }
            else {
                // ch is closed
                if(!st.isEmpty() && st.peek() == '{') {
                    st.pop();
                }
                else {
                    st.push(ch);
                }
            }
        }

        // stack contains invalid expression
        int a = 0, b = 0;

        while(!st.isEmpty()) {
            if(st.peek() == '{') {
                b++;
            }
            else {
                a++; // for closed brace
            }
            st.pop();
        }

        int ans = (a + 1) / 2 + (b + 1) / 2;
        return ans;
    }

    public static void main(String[] args) {
        //Valid Condition:
//        1.Every close brace has an open brace before it
//        no/ of open braces = no. of close braces

//        Invalid Strings: "{{{..." , "}}}}..." , "....}}}{{{...."
//        removing the valid part the left part will be one of the following type

//      Approach:
//        If string is of odd length , then there is no way hence return -1.
//        In input string remove the valid part

    }
}
