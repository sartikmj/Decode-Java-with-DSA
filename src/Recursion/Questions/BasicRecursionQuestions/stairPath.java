package Recursion.Questions.BasicRecursionQuestions;

import java.util.Scanner;

public class stairPath {
//    Leetcode 70 , Climbing Stairs
//
//    You are climbing a staircase. It takes n steps to reach the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


//    Approach: for 5 stairs if we either jump 1 or 2 stairs then the sum of total ways to climb the remaining stairs
//    4 and 3 is equal to the total ways to climb 5 stairs

//  formula: waysToClimb(n) = waysToClimb(n-1) + waysToCLimb(n-2) , as at once can only jump 1 or 2 stairs so n-1 and n-2 stairs left

    public static int stairs(int n){
        if(n==1 || n==2) return n; //OR if(n<=2)
        return stairs(n-1) + stairs(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stairs(n));
    }
}
