package Recursion.Questions.BasicRecursionQuestions;

import java.util.Scanner;

public class mazePath {
    public static int maze(int row, int col, int m , int n) { // row and col are starting coordinates , m and n are final coordinates
        if(row==n || col==n) return 1; //Base case , when reach at last row or last col
//        // OR we can use this base case , more professional :
//        if(row == m && col == n) return 1;
//        if(row>m || col>n) return 0;
        int rightWays = maze(row,col+1,n,n); //ek baar right chala gaya to kitne number of ways aayenge
        int downWays = maze(row+1,col,m,n);
        return rightWays + downWays;
    }

    public static int maze2(int m , int n){ //we will be assuming here that we are at m,n and have to go at 1,1 , it will decrease the parameters of the function
        if(m==1 || n==1) return 1;
        int rightWays = maze2(m,n-1); //col is decreasing
        int downWays = maze2(m-1,n); //row is decreasing
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the m: ");
        int m = sc.nextInt();
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }
}
