package Stack.Expressions.Conversions;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args){
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();

        for(int i=0;i<str.length();i++){

            if(Character.isDigit(str.charAt(i))){
                String x = "" + str.charAt(i);
                val.push(x);
            }
            else{ //it is an Operator
                String o = "" + str.charAt(i);

                String v2 = val.pop();
                String v1 = val.pop();

                String x = "(" + v1 + o + v2 + ')'; // brackets can be string or character
                val.push(x);
            }
        }
        System.out.println(val.peek());
    }
}
