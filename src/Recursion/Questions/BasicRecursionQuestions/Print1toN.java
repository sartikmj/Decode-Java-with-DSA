package Recursion.Questions.BasicRecursionQuestions;

import java.util.Scanner;

public class Print1toN {
    //Take a number n as input and print n to 1

    //Printing after call
    public static void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.println(n);
    }

    //Using Extra Parameter
    public static void Sol2(int x, int n) {
        if (x > n) return; //Base Case
        System.out.println(x); //work
        Sol2(x + 1, n); //call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        print1toN(n);
        Sol2(1, n);
    }
}