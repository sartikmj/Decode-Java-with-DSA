package PrefixSum;

import java.util.HashMap;

public class SubarraySumEqualsK {


//    Optimised Solution
//    Prefix Sum + HashMap
//    we will make a prefix sum array
//    Hashmap will contain the element and its frequency in the prefix sum array.
//    TC=O(n)  SC=O(n)
    public int subarraySum(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        //prefix sum array
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int ele = arr[i];
            if(ele==k) count++;

            //Main Logic
            int rem = arr[i] - k; //remaining value
            if(map.containsKey(rem)) count += map.get(rem);

            if(map.containsKey(ele)){
                //increase its frequency
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else{
                map.put(ele,1);
            }
        }
        return count;
    }


//    Brute Force -> TC=O(n^2) SC=O(1)
//    Generating all subarrays and then check how many of them have sum = k

    public int subarraySum1(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k) count++;
            }
        }
        return count;
    }

}
