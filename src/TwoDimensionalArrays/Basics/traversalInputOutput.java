package TwoDimensionalArrays.Basics;
import java.util.Scanner;
public class traversalInputOutput {
    //2D array is actually an array of arrays.
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int m = arr.length; // it will return number of rows
        int n = arr[0].length; // it will give number of columns
        System.out.println(m);

        Scanner sc = new Scanner(System.in);
        //Input 2D Array
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){// rows
            for(int j =0;j<n;j++){// cols
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Output using for each loop
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
