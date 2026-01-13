package Stack.Expressions;

import java.util.Stack;

public class InfixWithBrackets {

    //Bracket has the supreme priority
    //most of the code is same there just few changes
    //if op.size()==0 || ch=='(' || op.peek()=='(', we will push , bina soche samjhe
    //if you get closing bracket while traversing string , you will keep performing op stack operation with cal stack operands until you
    //find opening bracket in op stack
    //we will not push closing bracket

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        //traversing on string
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch; //storing the ascii value of the character of the string

            //ASCII => '0' -> 48 , '9' -> 57

            if(ascii>=48 && ascii<=57){ //i.e. the ch is a number
                val.push(ascii - 48); // minus 48 bcz we want to push the number not its ascii , to convert the ascii into number subtract 48
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(' ){ // the ch is not a number hence it is an operator so we will check if the op stack is empty
                op.push(ch);
            }
            //extra condition for closing bracket in string
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();

                    //checking and doing the operation and pushing the result
                    if(op.peek()=='-') val.push(v1-v2);
                    else if(op.peek()=='+') val.push(v1+v2);
                    else if(op.peek()=='*') val.push(v1*v2);
                    else if(op.peek()=='/') val.push(v1/v2);

                    //now popping that operator from op stack
                    op.pop();
                }
                op.pop(); //'(' hata diya hai op stack me se
            }
            else{ //ch is an operator and the op stack is not empty
                if(ch=='+' || ch=='-'){ //if top most operator has higher priority than the current element of str then first perform the operation
                    //in case of + and - , we always have to do operation bcz for all 4 operations will have more or equal priority to + and -

                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();

                    //checking and doing the operation and pushing the result
                    if(op.peek()=='-') val.push(v1-v2);
                    else if(op.peek()=='+') val.push(v1+v2);
                    else if(op.peek()=='*') val.push(v1*v2);
                    else if(op.peek()=='/') val.push(v1/v2);

                    //now popping that operator from op stack
                    op.pop();

                    //pushing the new ch i.e. an operator
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){

                    if(op.peek()=='*' || op.peek()=='/'){ //i.e. the priority is equal

                        //work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek()=='*'){
                            val.push(v1*v2);
                        }
                        if(op.peek()=='/'){
                            val.push(v1/v2);
                        }

                        op.pop();

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
            int v2 = val.pop();
            int v1 = val.pop();
            //now there can be any operator
            if(op.peek()=='-') val.push(v1-v2);
            else if(op.peek()=='+') val.push(v1+v2);
            else if(op.peek()=='*') val.push(v1*v2);
            else if(op.peek()=='/') val.push(v1/v2);

            op.pop();
        }
        System.out.println(val.peek()); //the last element inside the val stack is the answer for the string expression
    }
}
