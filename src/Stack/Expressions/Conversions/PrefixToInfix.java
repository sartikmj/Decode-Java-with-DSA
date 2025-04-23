package Stack.Expressions.Conversions;

import java.util.Stack;
public class PrefixToInfix {
    public static void main(String[] args){
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            if(Character.isDigit(str.charAt(i))){
                String x = "" + str.charAt(i);
                val.push(x);
            }
            else{ //if it is an operator
                String o = "" + str.charAt(i);

                String v1 = val.pop();
                String v2 = val.pop();

                String x = '(' + v1 + o + v2 + ")";  // brackets can be string or character
                val.push(x);
            }
        }
        System.out.println(val.peek());
    }
}
