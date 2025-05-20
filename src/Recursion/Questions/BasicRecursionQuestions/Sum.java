package Recursion.Questions.BasicRecursionQuestions;

import java.util.Scanner;

public class Sum {

    //with extra Parameterized recursion, with void return type
    public static void psum(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        psum(n-1,s+n);
    }

    //with int return type
    public static int sum(int n){
        if(n==0 || n==1) return n;
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
