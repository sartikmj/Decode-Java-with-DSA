package Advance_Java.StreamAPI;

import java.util.*;
import java.util.stream.Stream; //have to import this package

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 5, 8, 9);

        Stream<Integer> data = nums.stream(); //converting arraylist into a stream
//        A stream can only be used once only one operation can be performed


//        long count = data.count();
//        System.out.println(count);
//        data.forEach(n->System.out.print(n));
//        Stream<Integer> sortedData = data.sorted(); //returns a new stream with sorted data

        //Double the value of the data in the stream

        Stream<Integer> doubledData = data.map(i -> 2 * i);

//        Doing it in one Line , creating a stream sorting it doubling it and printing it.
        nums.stream().sorted().map(i -> i * 2).forEach(n -> System.out.println(n));

//        If you only want to do that on odd Numbers
        nums.stream().sorted().filter(i -> i % 2 == 1).map(i -> i * 2).forEach(i -> System.out.println(i));

//        If instead of printing you want to print the sum of all the final values.
        nums.stream().sorted().filter(i -> i % 2 == 1).map(i -> i * 2).reduce(0, (c,e) -> c+e); // 0 is the starting static value.
//        Parallel stream will do the operations parallely
    }
}
