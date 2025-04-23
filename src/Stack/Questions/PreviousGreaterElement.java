package Stack.Questions;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {
    //Brute Force
    //TC=0(n^2) SC=O(1)
    public static int[] prev(int[] arr){
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length-1; i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    result[i] = arr[j];
                    break;
                }
                result[i] = -1;
            }
        }
        return result;
    }

    // TC=O(n) SC=O(n)
    public static int[] previousGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(arr[i]);
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
                stack.push(arr[i]);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7,5,8,3,5};

        System.out.println(Arrays.toString(prev(arr)));
    }
}
