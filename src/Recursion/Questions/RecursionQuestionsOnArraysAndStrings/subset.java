package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class subset {
    //Print subsets of a string with unique characters, also do it for array
    // if a set has n elements it's number of subsets are 2^n

    //You can solve this problem by having a tree like taking an element or skipping an element then continue it till end
    //you will get all the combination

    //Try it for Array

    static ArrayList<String> arr = new ArrayList<>(); //globally declared

    public static void subsetString(int i , String s, String ans){
        if(i==s.length()){
//            String is Pass by Value
            arr.add(ans); // OR you can print it directly , sout(ans);
            return;
        }
        subsetString(i+1,s,ans); //not take
        subsetString(i+1,s,ans+=s.charAt(i)); //take
    }

//    Time Complexity = O(2^n)

//    Subset of Arrays
//    leetcode 78
    static List<List<Integer>> arrr = new ArrayList<>(); //globally declared to store all the subsets
    public static void subsetArray(int i, int[] nums, List<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> list = new ArrayList<>(); //to store the ans list, bcz arraylist is pass by reference.
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            arrr.add(list);
            return;
        }
        subsetArray(i+1,nums,ans);
        ans.add(nums[i]);
        subsetArray(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }

    public static void main(String[] args) {
//        String s = "abcd";
//        arr = new ArrayList<>(); // reset ArrayList, beneficial in case when multiple test cases run on it, use it when something is Global
//        subsetString(0,s,"");
//        System.out.println(arr);

        int[] nums = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        subsetArray(0,nums,ans);
        System.out.println(arrr);
    }
}
