package TwoDimensionalArrays.Questions;

public class setMatrixZero {
    // leetcode 73
    // Given an mxn integer matrix, if an element is 0 , set its entire row and col to 0's

    //Best way to do
    //Using constant extra space

    //-> leaving 0th row and 0th col and using them as the extra array for marking which row and column to make zero.
    //meanwhile traversing m-1 x n-1 sub 2D Array
    public static void setMatrixZero(int[][] matrix) {
        //variable to set if the 0th row and 0th col have zero or not . So, to be set to 0 or not
        boolean zeroRow = false;
        boolean zeroCol = false;

        //check the 0th row and 0th column
        //checking 0th row
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[0][j]==0){
                zeroRow = true;
                break;
            }
        }
        //checking 0th col
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                zeroCol = true;
                break;
            }
        }

        //traverse in the sub matrix without 0th row and 0th column
        for(int i =1;i<matrix.length;i++){
            for(int j =1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0; //making the 0th row element 0
                    matrix[i][0] = 0; //making the 0th col element 0
                }
            }
        }

        //set the marked columns to zero, traverse in the 0th row
        for(int j=1;j<matrix[0].length;j++){
            if(matrix[0][j]==0){ //set jth col to zero
                for(int i =1;i<matrix.length;i++){
                    matrix[i][j]=0;
                }
            }
        }

        //set the marked row to zero ,  traverse in the 0th col
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0] == 0){ //set the i th row to zero
                for(int j=1;j<matrix[0].length;j++){
                    matrix[i][j] = 0;
                }
            }
        }

        //checking if 0th row has 0 as an element in it
        if(zeroRow==true){ //set 0th to zero
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }

        //checking if 0th col has 0 as an element in it
        if(zeroCol==true){ //set 0th column to zero
            for(int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }

    }

    // 2nd best way to do
    public static void setZero(int[][] matrix){
        boolean[] rowZero = new boolean[matrix.length];
        boolean[] colZero = new boolean[matrix[0].length];

        // Step 1: Identify rows and columns that should be zeroed
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Step 2: Update the matrix
        for(int i = 0 ; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rowZero[i] || colZero[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

//        setZero(arr);

        setMatrixZero(arr);

        for(int[] i : arr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
