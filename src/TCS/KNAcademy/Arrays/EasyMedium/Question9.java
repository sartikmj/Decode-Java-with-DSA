package TCS.KNAcademy.Arrays.EasyMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] in1 = sc.nextLine().trim().split(" ");
        String[] in2 = sc.nextLine().trim().split(" ");

        int[] arr = new int[in1.length];
        int[] brr = new int[in2.length];

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(in1[i]);
        }

        for(int i=0;i<brr.length;i++){
            brr[i] = Integer.parseInt(in2[i]);
        }

        //logic
        Arrays.sort(arr);
        Arrays.sort(brr);

        ArrayList<Integer> ans = new ArrayList<>();

        int count=0;
        int i=0; // arr
        int j=0; // brr
        while(i<arr.length && j<brr.length){
            if(arr[i]==brr[j]){
                ans.add(arr[i]);
                count++;
                i++;
                j++;
            }
            else if(arr[i]>brr[j]){
                j++;
            }
            else if(brr[j]>arr[i]) i++;
        }

        Integer[] res = ans.toArray(new Integer[0]);

        System.out.print(Arrays.toString(res));
        System.out.println();
        System.out.println(count);;
    }
}
