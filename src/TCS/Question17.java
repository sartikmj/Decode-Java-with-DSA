package TCS;

import java.util.Scanner;

public class Question17 {

    // The logic for Permutations is given in the question

    public static int fact(int n){
        if(n==0 || n==1) return 1;

        return n*fact(n-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //members

        int ways = fact(2) * fact(n-1);

        System.out.println(ways);
    }
}
