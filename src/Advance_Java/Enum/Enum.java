package Advance_Java.Enum;

import java.util.Arrays;

enum Status { //Status is just a class
    Running, Failed, Pending, Success; //all these are objects of status
    //all these are named constants
}

public class Enum {

    public static void main(String[] args) {

        int i = 5;

        Status s = Status.Running;

        System.out.println(s); //Running

        Status a = Status.Failed;

        System.out.println(a); //Failed

        System.out.println(s.ordinal()); // index of the Named constant inside the Enum
        System.out.println(a.ordinal());

        Status[] sa = Status.values(); // array of all the named constants inside the enum

        System.out.println(Arrays.toString(sa));

        for(Status x : sa){
            System.out.println(x + ": " + x.ordinal());
        }
    }
}
