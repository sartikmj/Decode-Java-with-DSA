package Stack.Expressions.Conversions;

import java.util.Stack;
public class PrefixToPostfix {
    public static void main(String[] args){
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();

        for(int i=str.length()-1;i>=0;i--){

            if(Character.isDigit(str.charAt(i))){
                String s = "" + str.charAt(i);
                val.push(s);
            }
            else{ //when it is an Operator
                String o = "" + str.charAt(i);
                String v1 = val.pop();
                String v2 = val.pop();

                String x = v1 + v2 + o;
                val.push(x);
            }
        }
        System.out.println(val.peek());
    }
}
