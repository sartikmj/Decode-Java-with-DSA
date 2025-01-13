package TwoDimensionalArrays.Questions;


public class scoreAfterFlippingMatrix {
    //Leetcode 861
//You are given an m x n binary matrix grid.
//
//A move consists of choosing any row or column and toggling each value in that row or column (i.e., changing all 0's to 1's, and all 1's to 0's).
//
//Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.
//
//Return the highest possible score after making any number of moves (including zero moves).

    public static int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        //STEP-1: Put 1 at first position of every row -> Binary with most significant bit as 1 is the greatest
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) { //flip that row
                //traversing that row , for flipping
                for (int j = 0; j < n; j++) {
                    //flipping
                    if (grid[i][j] == 0) grid[i][j] = 1;
                    else grid[i][j] = 0;
                }
            }
            //Now every row first element is 1
            //So we don't have to flop row anymore

        }
        //Now we will flip column

        //STEP-2-> We will flip that column where number of 0s are more than the number of 1s.
        // now we will check each column except 0th bcz its every element is 1.

        //column traversel of matrix
        for (int j = 1; j < n; j++) {
            int noOfZeroes = 0;
            int noOfOnes = 0;
            //traversing column
            for (int i = 0; i < m; i++) {
                //traversing every element of col in a row
                if (grid[i][j] == 0) noOfZeroes++;
                else noOfOnes++;
            }
            //Now checking for flipping
            if (noOfZeroes > noOfOnes) { //flip that column
                //traversing that col row wise , for flipping
                for (int i = 0; i < m; i++) {
                    //flipping
                    if (grid[i][j] == 0) grid[i][j] = 1;
                    else grid[i][j] = 0;
                }
            }
            //flipping part is complete
        }
        //doing binary addition and converting that into integer , to find the score ,  with each place it will increase
        int score=0;
        int x=1; //the value of multiplication factor in Binary
        //peeche se aage ki taraf jayenge
        for(int j = n-1 ; j>=0;j--){
            for(int i=0;i<m;i++){
                score+= (grid[i][j]*x);
            }
            x*=2;
        }

        return score;
    }

    public static void main(String[] args){
        int[][] grid = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};

        System.out.print(matrixScore(grid));
    }
}
