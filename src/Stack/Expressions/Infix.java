package Stack.Expressions;
import java.util.Stack;
public class Infix {

    //Approach
    //we will take two stacks val and op
    //first we will traverse the String and convert the ch with their ascii value
    //then we will push the numbers into val stack
    //and when we find an operator we will check two condition if the op stack is empty or not
    //if the op stack is empty we will push the operator in the op stack
    //if the op stack is not empty then , we have some work to do , and we will check
    //if the ch is '+' or '-' then every operator will have either higher or equal priority compared to them
    //so we will perform the operation which is at the topmost of op stack between the operands at the top two values of the val stack, and pop the operator and operands from the stacks
    //after performing the operation we will push the result in the val stack and push the ch which is an operator in the op stack
    //now if the ch is '*' or '/' i.e. equal priority, then we will check if the topmost element in op stack is '*' or '/' then we will perform the operation the same way as before popping the operator at end
    //else if the op.peek() is '+' or '-' lesser priority , we will just directly push ch to the op stack
    //Now after the complete string has been traversed , there will still be some elements left in both stacks
    //now we will keep performing the operations in the op stack with operands in val stack one by one
    //till the size of the val stack is greater than 1 , 1 bcz the result of the complete operation will be a number , so val.size()>1
    //after the size of val stack becomes 1 , hence the final result of the operation is val.peek() hence the answer of the string expression +

    public static void main(String[] args){
        String str = "9-8/4+5";
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
            else if(op.size()==0){ // the ch is not a number hence it is an operator so we will check if the op stack is empty
                op.push(ch);
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
