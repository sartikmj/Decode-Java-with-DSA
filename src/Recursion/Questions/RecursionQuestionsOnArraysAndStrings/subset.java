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

    public static void subsetString(int i , String s, String ans, ArrayList<String> arr){
        if(i==s.length()){
//            String is Pass by Value
            arr.add(ans); // OR you can print it directly , sout(ans);
            return;
        }
        subsetString(i+1,s,ans,arr); //not take
        subsetString(i+1,s,ans+=s.charAt(i),arr); //take
    }

//    Time Complexity = O(2^n)

//    Subset of Arrays
//    leetcode 78

    //Without globally scoped is on leetcode latest submission
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
        subsetArray(i+1,nums,ans); // not take
        ans.add(nums[i]); // adding the element
        subsetArray(i+1,nums,ans); // take
        ans.remove(ans.size()-1); // remove the element we add.
    }

    public static void main(String[] args) {
        String s = "abcd";
        ArrayList<String> arr = new ArrayList<>();
        subsetString(0,s,"",arr);
        System.out.println(arr);

        int[] nums = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        subsetArray(0,nums,ans);
        System.out.println(arrr);
    }
}
