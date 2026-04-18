package TCS.KNAcademy.Arrays.EasyMedium;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] in = sc.nextLine().trim().split(" ");

        int[] arr = new int[in.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }

        int n = arr.length;

        int[] rightMin = new int[n];

        rightMin[n-1] = arr[n-1];

        for(int i=n-2;i>=0;i--){
            rightMin[i] = Math.min(rightMin[i+1],arr[i]);
        }

        int leftMax = arr[0];

        for(int i=1;i<n-1;i++){

            if(leftMax < arr[i] && arr[i] < rightMin[i+1]){
                System.out.println(arr[i]);
                return;
            }

            leftMax = Math.max(leftMax, arr[i]);
        }
        System.out.println(-1);
    }
}
