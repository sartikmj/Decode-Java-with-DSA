package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

import java.util.Scanner;

public class generateParentheses {

    // Leetcode 22

//    WRONG APPROACH: Adding to left/right & enclosing

//    HINT: At any point no. of Closing Brackets <= no. of Opening Brackets
//    i.e., at any point closing brackets can not be greater than number of opening brackets
//    IMP:- So closing bracket will be called with the condition closing < opening
//    also opening brackets < n
    public static void parentheses(int open, int close, int n, String s){ // opening bracket , close bracket , n , string
        if(s.length() == n*2){
            System.out.println(s);
            return;
        }
        if(open < n) parentheses(open+1,close,n,s+"(");
        if(close < open) parentheses(open,close+1,n,s+")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parentheses(0,0,n,"");
    }
}
