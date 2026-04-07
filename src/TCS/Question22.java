package TCS;

import java.util.Scanner;

public class Question22 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int fine = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                fine= fine + (arr[i]-k);
            }
        }
        System.out.print(fine);
    }
}
