package TCS.KNAcademy.Arrays.Easy;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n==1){
            System.out.println(0);
            return;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);

    }
}
