package PrefixSum.Leetcode;

import java.util.HashMap;

//GFG
public class Subarraywith0sum {

    static boolean findsum(int arr[]) {
        // Your code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) return true;

            if(map.containsKey(sum)){
                return true;
            }
            else map.put(sum,i);
        }
        return false;
    }
}
