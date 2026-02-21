package Stack.Questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.List;
public class NextGreaterElement {

    //Brute Force     TC=(n^2) SC=O(n)
    public static int[] great(int[] arr) { //you should not modify the input it is not a good practice
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j]>arr[i]){
                    result[i] = arr[j];
                    break;
                }
                result[i] = -1; //to set the last element next greater element as -1
            }
        }
        return result;
    }

//    Approach:
// we need to know the right elements of the current element, so we need to traverse from back to front
//    we will take a stack which will store elements in a particular order
//    now we will look at the right most element and then look at stack , as the stack is empty we will store -1 in the answer
//    now we will put the last element in the stack and move further
//    for the next element we will check the top most element in the stack
//    if the top most element in the stack is greater than the current element then it is the next great element we will store the element in answer, put the current element in stack and move forward
//    if the top most element in stack is less than or equal to the current element then pop the elements from stack until the
//    top element of stack is greater than the current element
//    then store the top element in the answer and push the current element into stack
//    the stack is called Monotonic stack bcz it stored the elements in a specific order that is decreasing order from bottom to top.

    // TC=O(n) , SC=O(n)
    public static int[] greaterElement(int[] arr) {
        int[]result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=(-1);
            }
            else{
                result[i] = (stack.peek());
            }
            stack.push(arr[i]);
        }
        return result;
    }

    //we can also do this with another approach , storing indexes instead of elements in the stack

    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 3, 5};

        System.out.println(Arrays.toString(greaterElement(arr)));

    }
}
