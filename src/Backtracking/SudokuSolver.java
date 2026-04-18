package Backtracking;

public class SudokuSolver {

    public boolean isValid(char[][] board, int row, int col, char num){
        //check row
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }
        //check col
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        //check 3x3 grid
        //finding the starting row and col to start traversing wrt to that ele(finding the grid)
        int sRow = row/3*3; //IMPORTANT
        int sCol = col/3*3; //IMPORTANT
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }

    public void solve(char[][] board, int row, int col, char[][] grid) {
        //base case
        if(row==9){
            //copy and paste all the elements from board to grid
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    grid[i][j] = board[i][j];
                }
            }
            return;
        }
        if (board[row][col] != '.') { // call
            if (col != 8)
                solve(board, row, col + 1, grid);
            else
                solve(board, row + 1, 0, grid);
        } else { //board[row][col]=='.'
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(board, row, col, ch)) {
                    board[row][col] = ch;
                    //calls
                    if (col != 8)
                        solve(board, row, col + 1, grid);
                    else
                        solve(board, row + 1, 0, grid);
                    //backtracking
                    board[row][col] = '.';
                }
            }
        }
    }

    public void solveSudoku(char[][] board) {
        char[][] grid = new char[9][9];
        solve(board, 0, 0, grid);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j] = grid[i][j];
            }
        }
    }

    //Without using extra space grid
    static int check = 0;
    public void solve(char[][] board, int row, int col) {
        //base case
        if(row==9){
            check = 1;
            return;
        }
        if (board[row][col] != '.') { // call
            if (col != 8)
                solve(board, row, col + 1);
            else
                solve(board, row + 1, 0);
        } else { //board[row][col]=='.'
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(board, row, col, ch)) {
                    board[row][col] = ch;
                    //calls
                    if (col != 8)
                        solve(board, row, col + 1);
                    else
                        solve(board, row + 1, 0);
                    if(check==1) return;
                    //backtracking
                    board[row][col] = '.';
                }
            }
        }
    }

    public void solveSudoku1(char[][] board) {
        solve(board, 0, 0);
        check = 0;
    }
}
