package Advance_Java.StreamAPI.Questions;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sum {


    public static int sumUsingStreams(int[] arr) {
        // code here
//        return Arrays.stream(arr).reduce(0, (c, e) -> c + e);

        //OR

        return Arrays.stream(arr).sum();
    }


    public static void main(String[] args) {


    }
}
