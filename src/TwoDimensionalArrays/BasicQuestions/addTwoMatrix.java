package TwoDimensionalArrays.Basics.BasicQuestions;

public class addTwoMatrix {
    //    wap to add two matrices
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] brr = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] res = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                res[i][j] = arr[i][j] + brr[i][j];
            }
        }

        for (int[] ele : res) {
            for (int i : ele) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
