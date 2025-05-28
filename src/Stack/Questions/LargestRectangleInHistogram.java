package Stack.Questions;

import java.util.*;
// leetcode 84
public class LargestRectangleInHistogram {
    //Approach
    //first we will find Next Smaller Element and Previous Smaller Element for all the elements of array heights
    //then for finding the area for each element of heights we will use the formula
    //          heights*(nse-pse-1)
    //then find the max area out of all

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        //calculate nse
        //NOTE: WE ARE PUSHING INDEXES INSIDE THE STACK NOT THE VALUES OF THE ARRAY
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nse[i] = n; //filling the last index inside nse[]
            } else {
                nse[i] = st.peek();
            }
            st.push(i);
        }

        //emptying the stack
        while (!st.isEmpty()) {
            st.pop();
        }

        //calculate pse
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }
            st.push(i);
        }

        //Maximum Area of Rectangle
        int max = 0;
        for (int i = 0; i < n; i++) {
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
