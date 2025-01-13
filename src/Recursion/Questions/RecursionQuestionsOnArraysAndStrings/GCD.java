package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

import java.util.Scanner;

public class GCD {
    //It is also called HCF

//    HCF(a,b) <= min(a,b)                   LCM(a,b) >= max(a,b)
//    for HCF we run a loop from 1 to min(a,b) and check which value of i is a factor of both a and b , which means
//    a%i == 0 && b%i == 0

    public static int gcdLoop(int a , int b){ // TC = O(min(a,b)) , not a good TC.
        for(int i = Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;
    }

//    hcf(a,b) = hcf(b%a,a)
    public static int gcdRecursion(int a , int b){ // TC = O(log(min(a,b)))
        if(b%a==0) return a;
        return gcdRecursion(b%a,a);
    }
//    we don't have to worry about for which number is big or small a or b , it will gets in right way

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(gcdLoop(a,b));
    }
}
