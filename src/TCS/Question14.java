package TCS;

import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int count = 1; //bcz first ele will always be counted

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                count++;
                max = arr[i];
            }
        }

        System.out.println(count);

    }
}
