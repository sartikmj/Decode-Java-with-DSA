package TCS;

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rem = 0;
        int price = 1;
        while(n>0){
            rem = n%10;
            price*=rem;
            n=n/10;
        }
        System.out.println(price);
    }
}
