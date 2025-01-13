package Recursion.Questions.BasicRecursionQuestions;

import java.util.Scanner;

public class fibonacciSeries {
//    Write a function to calculate the nth fibonacci number using recursion

    //Logic:
    // fibo(n) = fibo(n-1) + fibo(n-2) ;

    public static int fibo(int n){
        if(n == 0 || n == 1) return n; //Base case //OR if(n<2)
        return fibo(n-1) + fibo(n-2); //Multiple Calls
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
