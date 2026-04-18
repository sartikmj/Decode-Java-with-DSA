package TCS;

import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt(); //date

        int x = sc.nextInt(); //fine

        int fine = 0;
        if(d%2==0){ //even

            for(int i=0;i<n;i++){
                if(arr[i]%2==1) fine+=x;
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i]%2==0) fine+=x;
            }
        }
        System.out.println(fine);
    }
}
