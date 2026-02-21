package Stack.Questions;
import java.util.*;
public class RemoveConsecutiveSubsequences {
    //Given a subsequence of numbers. Remove all the consecutive subsequences of length greater than or equal to 2 that contains the same
    //element

//    Algorithm
//    if stack is empty push the element
//    if stack is not empty and top of stack is not equal to the current element of array push that element into stack
//    if top of stack is equals to the current element of array then first check if the next element of the array is not equal to the
//    current element then pop the stack, But if the next element is equal to the current element u do nothing just move forward to the
//    next element.

    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                if(i==n-1 || arr[i]!=arr[i+1]){ //either we are at the last element OR current element is not equal to the next element
                    st.pop();
                }
                else{ //arr[i]==arr[i+1]
                    //do nothing , skip the element
                }
            }
        }
        //Now fill the stack with desired values into array
        int[] res = new int[st.size()];

        int m = res.length;

        for(int i=m-1;i>=0;i--){
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] res = remove(arr);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
