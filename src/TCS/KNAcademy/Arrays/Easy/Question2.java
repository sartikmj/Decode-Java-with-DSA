package TCS.KNAcademy.Arrays.Easy;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Question asks to do it in constant time
        long ans = ( (long) n * (n+1)) / 2;

        System.out.println(ans);
    }
}
