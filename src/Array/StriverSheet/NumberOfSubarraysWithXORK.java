package Array.StriverSheet;

import java.util.HashMap;

public class NumberOfSubarraysWithXORK {

    //Optimized
    //TC=O(N) SC=O(N)
    public long subarrayXor(int[] arr, int k) {
        // code here
        int xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // x, freq(x)

        // Important: prefix XOR 0 appears once
        map.put(0, 1);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            xor ^= arr[i];

            // k
            int x = xor ^ k; //we have to find how many times this x appears

            if (map.containsKey(x)) {
                count += map.get(x);
            }


            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return (long) count;
    }

    //Optimized and Cleaner

    public long subarrayXor1(int arr[], int k) {
        int xor = 0;
        long count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Important: prefix XOR 0 appears once
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];

            int x = xor ^ k;

            // Add frequency safely
            count += map.getOrDefault(x, 0); //this line is different, different way of writing the same thing

            // Store current prefix XOR
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }


    public static void main(String[] args) {

        //Brute Force -> just use two nested loops generate all subarray

        // Main Formula
        // x = XOR ^ K, we are looking for x to present in the map

        //Optimal


    }
}
