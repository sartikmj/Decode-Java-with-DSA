package Stack.Expressions;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";

        Stack<Integer> val = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){ //instead of using ascii , to find out if it is an integer or not you can use this method
                val.push((Character.getNumericValue(ch))); //instead of using ascii , you can push the numeric value get by using the method Character.getNumericValue
            } else{ //if not number
                int v2 = val.pop();
                int v1 = val.pop();

                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        //after the loop ended there will be only one element left in the stack and that is the answer
        System.out.println(val.peek());
    }
}
