package Advance_Java.StreamAPI.Questions;

import java.util.Arrays;

public class MaxOdd {

    public static int filterUsingStreams(int[] arr) {
        // Your code here
        return Arrays.stream(arr).filter(a -> a%2==1).max().getAsInt();

        // Use filter() to get only odd elements then apply max().getAsInt()
    }

    public static void main(String[] args) {

    }
}
