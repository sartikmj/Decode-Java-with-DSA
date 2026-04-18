package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class Question20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        Arrays.sort(arr); //sorting the array

        int minDiff = Integer.MAX_VALUE;

        for(int i=0;i<=n-m;i++){
            int diff = arr[i+m-1] - arr[i];

            minDiff = Math.min(minDiff,diff);
        }

        System.out.println(minDiff);
    }
}
