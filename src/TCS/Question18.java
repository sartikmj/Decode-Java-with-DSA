package TCS;

import java.util.Scanner;

public class Question18 {

    public static int sumDigits(int n){
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

    public static int singleDigit(int n){
        while(n>=10){
            n = sumDigits(n);
        }
        return n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        if(r==0){
            System.out.println(0);
            return;
        }

        int sum = sumDigits(n);

        int an = sum * r;

        int ans = singleDigit(an);

        System.out.println(ans);
    }
}
