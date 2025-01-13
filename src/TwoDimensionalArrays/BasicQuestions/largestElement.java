package TwoDimensionalArrays.Basics.BasicQuestions;

import java.util.Scanner;

public class largestElement {
    //WAP to find the largest element in the given 2D array of integers.
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;

        for(int[] ele : arr){
            for(int i : ele){
                if(i > max){
                    max = i;
                }
            }
        }

        //Another way
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println("Largest Element: " + max);
    }
}
