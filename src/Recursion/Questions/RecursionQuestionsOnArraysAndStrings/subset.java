package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

import java.util.ArrayList;

public class subset {
    //Print subsets of a string with unique characters , also do it for array
    // if a set has n elements it's number of subsets are 2^n

    //You can solve this problem by having a tree like taking an element or skipping an element then continue it till end
    //you will get all the combination

    //Try it for Array

    static ArrayList<String> arr = new ArrayList<>(); //globally declared

    public static void subsetString(int i , String s, String ans){
        if(i==s.length()){
            arr.add(ans); // OR you can print it directly , sout(ans);
            return;
        }
        subsetString(i+1,s,ans); //not take
        ans += s.charAt(i);
        subsetString(i+1,s,ans); //take
    }

//    Time Complexity = O(2^n)

    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>(); // reset ArrayList , beneficial in case when multiple test cases run on it , use it when something is Global
        subsetString(0,s,"");
        System.out.println(arr);
    }
}
