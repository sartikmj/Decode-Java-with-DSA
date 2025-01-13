package Recursion.Questions.BasicRecursionQuestions;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }

    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
