package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

import java.util.Scanner;

public class binaryStrings {
//    Generate all binary strings of length n without consecutive 1's

    public static void printStrings(String s,int n){
        int l = s.length();
        if(l==n){ //base case
            System.out.println(s);
            return;
        }
        if(l==0 || s.charAt(l-1)=='0'){ // if this condition is true then both 1 and 0 will be called
            printStrings(s+1,n); //pass by value
            printStrings(s+0,n); //pass by value
        }
        else{ //else only 0 will be called bcz consecutive 1s are not allowed
            printStrings(s+0,n);
        }
        //to find all possible combinations just remove conditions and call both 1 amd o always
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printStrings("",n);
    }
}
