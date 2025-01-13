package TwoDimensionalArrays.Questions;

public class transposeOfMatrix {
    //Print the transpose of a matrix entered by the user and store it in a new matrix.

    public static int[][] PrintTranspose(int[][] arr) {
        //        Transpose is nothing but Column wise printing of the matrix

        //if a matrix has order mxn the order of its transpose will be nxm

        int m = arr.length , n = arr[0].length;

        //Column wise printing
        for(int j=0;j<n;j++){ //cols
            for(int i =0;i<m;i++){//rows
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr;
    }

    //Write a Program to print the transpose of the matrix entered by the user and store it in a new Matrix.

    public static int[][] NewTransposeMatrix(int[][] matrix){
        //storing The Transpose in another Matrix
        int m = matrix.length , n = matrix[0].length;
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int j = 0;j<matrix[0].length;j++){
            for(int i =0;i<matrix.length;i++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }



    public static void main(String[] a){
        int[][] arr= {{1,2},{3,4},{5,6}};
        PrintTranspose(arr);
    }
}
