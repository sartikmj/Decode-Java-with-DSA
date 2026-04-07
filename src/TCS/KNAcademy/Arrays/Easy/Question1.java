package TCS.KNAcademy.Arrays.Easy;

import java.util.Scanner;
import java.util.HashSet;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Read first Line and split into integers for array a[]
        String[] aInput = sc.nextLine().trim().split(" ");

        int[] a = new int[aInput.length];

        for(int i=0;i<a.length;i++){
            a[i] = Integer.parseInt(aInput[i]);
        }

        //Read second line and split into integers for array b[]
        String[] bInput = sc.nextLine().trim().split(" ");

        int[] b = new int[bInput.length];

        for(int i=0;i<b.length;i++){
            b[i] = Integer.parseInt(bInput[i]);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<a.length;i++) set.add(a[i]);
        for(int i=0;i<b.length;i++) set.add(b[i]);

        System.out.println(set.size());

    }
}
