package Queue.Questions;

import java.util.*;

public class FirstNegativeInWindowOfSizeK {

    //Brute Force
//    TC=O(N*K)
    static List<Integer> firstNegInt(int[] arr, int k) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            boolean foundNegative = false;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    foundNegative = true;
                    list.add(arr[j]);
                    break;
                }
            }
            if (!foundNegative) {
                list.add(0);
            }
        }
        return list;
    }

    //Optimized
//    Using Queue

    //    Approach
//    1. Maintain a Queue for storing indices of negative elements
//    2. Iterate over the elements of array and keep on removing indices from queue which are outside the window
//    3. If queue is not empty then element at queue's peek is the first negative element in the current window, and we will store
//    it in the result.

    //    TC=O(N) SC=O(N)
    static int[] firstNegInteger(int[] arr, int k, int N) {
       Queue<Integer> q = new LinkedList<>();
       int[] res = new int[N-k+1];

       for(int i=0;i<N;i++){
           if(arr[i]<0){
               q.add(i);
           }
       }

       for(int i=0;i<N-k+1;i++){
           if(q.size()!=0 && q.peek()<i) q.remove();
           if(q.size()!=0 && q.peek() <= i+k-1) res[i] = arr[q.peek()];
       }

       return res;
    }
}

