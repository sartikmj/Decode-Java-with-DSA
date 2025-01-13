package Array.HomeWorkQuestions;

import java.util.Arrays;

public class uniqueNumber {
//    Find the unique number in a given Array where all the elements are being repeated twice with one value
//    being unique.

    //Method 1: Using Arrays.sort() method
    public static int Unique1(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        //if the unique element is the last one in the sorted array
        return arr[arr.length - 1];
    }

    //Method 2: Using Bit Manipulation
    public static int Unique2(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }


    public static void main(String[] a) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};

        System.out.println(Unique1(arr));
        System.out.println(Unique2(arr));
    }
}


