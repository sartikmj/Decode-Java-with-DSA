package TCS.KNAcademy.Arrays.EasyMedium;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] aInput = sc.nextLine().split(" ");

        int[] a = new int[aInput.length];

        for(int i=0;i<aInput.length;i++){
            a[i] = Integer.parseInt(aInput[i]);
        }

        int count = 0;

        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]) count++;
        }

        if(a[a.length-1]>a[0]) count++;

        if(count<=1) System.out.println(true);
        else System.out.println(false);

    }
}
