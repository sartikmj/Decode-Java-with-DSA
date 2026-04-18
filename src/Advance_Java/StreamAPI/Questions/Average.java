package Advance_Java.StreamAPI.Questions;

import java.util.Arrays;

public class Average {

    public static double avgUsingStreams(int[] arr) {
        // Your code here

        return Arrays.stream(arr).average().getAsDouble();

        // Use stream().average().getAsDouble()
        // Just return and don't typecase anything.
    }

    public static void main(String[] args) {

    }
}
