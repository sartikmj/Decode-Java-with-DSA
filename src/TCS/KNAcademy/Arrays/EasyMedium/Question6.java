package TCS.KNAcademy.Arrays.EasyMedium;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().trim().split(" ");

        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int l=0,r=0;
        int maxLen=0;
        while(r<arr.length){
            if(arr[l]==1&& arr[r]==1){
                maxLen = Math.max(maxLen,r-l+1);
            }
            else if(arr[r]!=1){
                while(r<arr.length && arr[r]!=1) r++;
                l=r;
            }
            r++;
        }
        System.out.println(maxLen);


        //Another way
        int count = 0;
        int maxLen2 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                maxLen2 = Math.max(maxLen2, count);
            } else {
                count = 0;
            }
        }

        System.out.println(maxLen);
    }
}
