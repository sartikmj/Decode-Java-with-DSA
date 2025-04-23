package Stack.Questions;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

    //Brute Force
    public static int[] brute(int[] arr){
        int[] result = new int[arr.length];

        result[0] = 1;

        for(int i = 1; i < arr.length; i++){
            result[i]=1;
            for(int j=i-1; j>=0 && (arr[i] >= arr[j]) ; j--){
                result[i]++;
            }
        }

        return result;
    }

    //Brute Force easy to understand course
//    public static int[] findStockSpans(int []arr) {
//        int[] span= new int[arr.length];
//        // Write your code here.
//        //edge case
//        span[0] = 1;
//        for(int i=1;i<arr.length;i++){
//            int count=1;
//            for(int j=i-1;j>=0;j--){
//                if(arr[j]<arr[i]){
//                    count++;
//                }
//                if(arr[j]>=arr[i]) break;
//            }
//            span[i] = count;
//        }
//        return span;
//    }

    //TC=O(n) SC=O(n)
    //We will use the approach of Previous Greater Element , instead of element we will store indexes
    // span will be equal to index of current element - index of prev greater element
    public static int[] stockSpan(int[] arr) {
        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        result[0] = 1;
        for(int i = 1; i < arr.length; i++){
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = i+1; //all previous days plus current day , bcz it is the largest
            }
            else{
                result[i] = i - stack.peek(); // Days between current and previous higher
            }
            stack.push(i); // Always push current index
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};

        System.out.println(Arrays.toString(stockSpan(arr)));
    }
}
