package Stack.Questions;
import java.util.*;
public class PreviousSmallerElement {

    //Brute Force
//    TC=O(n)
    public static int[] brute(int[] arr){
        int[] nse=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>=0;j--){
                if(arr[j]<arr[i]){
                    nse[i]=arr[j];
                    break;
                }
                nse[i]=-1;
            }
        }
        return nse;
    }

    //Optimize
//    TC=O(n)
    public static int[] previousSmallerElement(int[] arr){
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{ //st.peek()<arr[i]
                pse[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return pse;
    }

    public static void main(String[] args) {

    }
}
