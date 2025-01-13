package Array;

import java.util.Arrays;

public class builtInMethods {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

//        built-in method to sort an array
        Arrays.sort(arr);
        System.out.println();

        //For each or Enhanced Loop
        for(int x : arr){ // (read it like this) for int x in arr
            // x is not the index of arr
            // x is the element itself of the arr
            // in enhanced loop you don't need to give the size of the array
            System.out.print(x+" "); //here we print x not arr[x]

            //if indexing is needed use for loop otherwise prefer enhanced loop
            // Enhanced Loop is mainly used when we want to print the values that are inside a Data Structure
        }
    }
}
