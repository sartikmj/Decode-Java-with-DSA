package TwoDimensionalArrays.Questions;

public class transformIntoTranspose {
    // Transform a Matrix into its Transpose (without using another 2D Array)
    // Transform into Transpose
    //It is only possible in square matrix.
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length; //its a square matrix so m == n ;
        print(arr);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                //we can actually transpose and stop re-swapping of elements if we only see lower triangle matrix or half matrix i.e j<i
                //without this condition we get back the same array
                //swap
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;


            }
        }
        print(arr);
    }

    public static void print(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
