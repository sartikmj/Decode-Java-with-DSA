package Recursion.Questions.BasicRecursionQuestions;

import java.util.Scanner;

public class PrintNto1 {
    //Take a number n as input and print 1 to n
    public static void printNto1(int n) {
        if (n == 0) return;
        System.out.println(n);
        printNto1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        printNto1(n);
    }
}
