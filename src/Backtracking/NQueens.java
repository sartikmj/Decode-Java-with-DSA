package Backtracking;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nqueen(board, 0);
    }

    private static void nqueen(char[][] board, int row) { //row will decide the row on which we have to place the queen
        int n = board.length;
        if (row == n) { //got the ans, base case
            //Printing the board
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        //work and call
        for (int j = 0; j < board.length; j++) { //all col of the row will be traversed
            if (isSafe(board, row, j) == true) {
                board[row][j] = 'Q';

                //recursion
                nqueen(board, row + 1);

                //backtracking
                board[row][j] = '.';
            }
        }
        // no return bcz method will end by it self as return type is void
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        //check row -> East and West
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        //check col -> North and South
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }

        //check NorthEast
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //check South East
        i =  row;
        j = col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }

        //check South West
        i = row;
        j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //check North West
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        return true;
    }
}
