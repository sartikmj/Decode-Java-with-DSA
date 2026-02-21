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
//        we will add new digits at the end of the string
        if(l==0 || s.charAt(l-1)=='0'){ // if last digit is 0 we can add both 0 and 1 to the string
            printStrings(s+1,n); //pass by value
            printStrings(s+0,n); //pass by value
        }
        else{ //if the last digit of the string is 1, we will add only 0.
            printStrings(s+0,n);
        }
        //to find all possible combinations, just remove conditions and call both 1 and 0 always
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = in.nextInt();
        printStrings("",n);
    }
}
