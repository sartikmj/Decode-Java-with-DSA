package Advance_Java.StreamAPI.Questions;

import java.util.Arrays;

public class Max {

    public static int maxUsingStreams(int[] arr) {
        // Your code here

//        return Arrays.stream(arr)
//                .reduce(Integer.MIN_VALUE, (a,b) -> a>b?a:b);


        //OR


        return Arrays.stream(arr).max().getAsInt();

        // Use stream().max().getAsInt()
    }

    public static void main(String[] args) {

    }
}
