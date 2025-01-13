package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

import java.util.Scanner;

public class generateParenthesis {

    // Leetcode 22

//    WRONG APPROACH: Adding to left/right & enclosing

//    HINT: At any point no. of Closing Brackets <= no. of Opening Brackets
//    i.e. at any point closing brackets can not be greater than number of opening brackets
//    IMP:- So closing bracjket will be called with the condition closing < opening
//    also opening brackets < n
    public static void parenthesis(int open,int close,int n,String s){ // opening bracket , close bracket , n , string
        if(s.length() == n*2){
            System.out.println(s);
            return;
        }
        if(open < n) parenthesis(open+1,close,n,s+"(");
        if(close < open)parenthesis(open,close+1,n,s+")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parenthesis(0,0,n,"");
    }
}
