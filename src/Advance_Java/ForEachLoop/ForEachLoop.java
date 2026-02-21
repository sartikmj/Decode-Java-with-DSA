package Advance_Java.ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //method 1 : External Loop

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(int i : list){
            System.out.println(i);
        }

        //Method 2 : Inner Loop -> For Each Method
        list.forEach(i -> System.out.println(i)); //forEach throws the value out of the list we accept it in i and print it.

    }
}
