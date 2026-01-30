package Stack.Expressions.Conversions;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        //traversing on string
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch; //storing the ascii value of the character of the string

            //ASCII => '0' -> 48 , '9' -> 57

            if(ascii>=48 && ascii<=57){ // 0 to 9
                String s = "" + ch; //storing the ch as a String , which is actually a number
                val.push(s); //putting the number as string in the num stack
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(' ){ // the ch is not a number hence it is an operator so we will check if the op stack is empty
                op.push(ch);
            }
            //extra condition for closing bracket in string
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();

                    //now taking the operator from the op stack
                    char o = op.pop();

                    //making the String and pushing it in the val stack
                    String x = v1 + v2 + o;
                    val.push(x);
                }
                op.pop(); //'(' hata diya hai op stack me se
            }
            else{ //ch is an operator and the op stack is not empty
                if(ch=='+' || ch=='-'){ //if top most operator has higher priority than the current element of str then first perform the operation
                    //in case of + and - , we always have to do operation bcz for all 4 operations will have more or equal priority to + and -

                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();

                    //now taking the operator from the op stack
                    char o = op.pop();

                    //making the String and pushing it in the val stack
                    String x = v1 + v2 + o;
                    val.push(x);

                    //pushing the new ch i.e. an operator
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){

                    if(op.peek()=='*' || op.peek()=='/'){ //i.e. the priority is equal

                        //work
                        String v2 = val.pop();
                        String v1 = val.pop();

                        //now taking the operator from the op stack
                        char o = op.pop();

                        //making the String and pushing it in the val stack
                        String x = v1 + v2 + o;
                        val.push(x);

                        //push
                        op.push(ch);
                    }
                    else{ //ch have higher priority than op.peek() , so just push the ch
                        op.push(ch);
                    }
                }
            }
        }
        //now the string has been completely traversed but some ch are still in stacks
        while(val.size()>1){ // size > 1 bcz , after all operation the result will be stored in val stack i.e. a number
            //work
            String v2 = val.pop();
            String v1 = val.pop();

            //now taking the operator from the op stack
            char o = op.pop();

            //making the String and pushing it in the val stack
            String x = v1 + v2 + o;
            val.push(x);

        }
        System.out.println(val.peek()); //the last element inside the val stack is the postfix for the infix expression
    }
}
