package TCS.KNAcademy.Arrays.EasyMedium;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String[] aInput = sc.nextLine().trim().split(" ");

        int[] a = new int[aInput.length];

        for(int i=0;i<aInput.length;i++){
            a[i] = Integer.parseInt(aInput[i]);
        }

        int index=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=a[index]){
                count++;
                index++;
                a[index] = a[i];
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(a));
    }
}
