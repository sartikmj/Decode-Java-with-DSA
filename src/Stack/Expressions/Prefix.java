package Stack.Expressions;

import java.util.Stack;

public class Prefix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(Character.getNumericValue(ch));
            }
            else{ //in Prefix , the first pop value will be v1 and second pop value will be v2
                int v1 = val.pop();
                int v2 = val.pop();

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
