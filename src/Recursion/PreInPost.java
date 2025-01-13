package Recursion;

import java.util.Scanner;

public class PreInPost {
    public static void pip(int n) {
        if(n==0) return;
        System.out.println("pre"+n); // pre
        pip(n-1);
        System.out.println("In"+n); // in
        pip(n-1);
        System.out.println("post"+n); // post
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        pip(n);
    }
}
