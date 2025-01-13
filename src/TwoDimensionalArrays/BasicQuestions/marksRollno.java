package TwoDimensionalArrays.Basics.BasicQuestions;
import java.util.Scanner;
public class marksRollno {
    //Write a program to store roll number and marks obtained by 4 students side by side in a matrix.
    public static void main(String[] args) {
        //side bt side mean marks roll , two col side by side not up and down
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        //input in the terminal is given row wise
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int[] ele : arr){
            for(int i : ele){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
