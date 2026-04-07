package BitManipulation.Questions.BitMasking;

import java.util.Scanner;

public class FlipAllBits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int bits = 0; //number of bits

        while(temp!=0){
            bits++;
            temp/=2;
        }

        // making a mask
        int mask = 1<<bits;
        mask = mask - 1; //in order to flip all bits

        n = n^mask;

        System.out.println(n);
    }
}
