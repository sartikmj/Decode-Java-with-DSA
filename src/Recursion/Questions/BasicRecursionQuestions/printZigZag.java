package Recursion.Questions.BasicRecursionQuestions;

import java.util.Scanner;

public class printZigZag {
    // SAME AS PIP(Pre In Post) CODE
    public static void zigZag(int n) {
        if(n==0) return;
        System.out.print(n);
        zigZag(n-1);
        System.out.print(n);
        zigZag(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        zigZag(n);
    }
}
