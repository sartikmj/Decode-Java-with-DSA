package TCS;

import java.util.Scanner;

public class Question8 {

    public static boolean isPrime(int n){

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 2;
        int sum = 0;
        while(n > 0){
            if(isPrime(i)){
                sum += i;
                n--;
            }
            i++;
        }

        System.out.println(sum);
    }
}
