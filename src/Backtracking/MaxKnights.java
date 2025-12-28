package Backtracking;

// Find the max number of Knights that can be placed in a given nXn chessboard
public class MaxKnights {

    static int maxKnights = -1;
    static int number = 5; //number of knights

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        int i, j;
        // 2Up + 1Right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'K') return false;

        //2Up + 1Left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        //2Down + 1Right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'K') return false;

        //2Down + 1Left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K') return false;

        //2Right + 1Up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K') return false;

        //2Right + 1Down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K') return false;

        //2Left + 1Up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        //2Left + 2Down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'K') return false;

        return true;
    }

    public static void nKnight(char[][] board, int row, int col, int num) { //num is number of knights
        int n = board.length;
        if (row == n) {
//            if(num == number){
//                for (int i = 0; i < n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        System.out.print(board[i][j]);
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
            maxKnights = Math.max(maxKnights, num);
            return;
        } else if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col != n - 1) { //col is not the last col
                nKnight(board, row, col + 1, num + 1); //same row next col, traversing
            } else {
                nKnight(board, row + 1, 0, num + 1); //next row first col
            }
            //backtracking
            board[row][col] = 'X';
        }
        //not safe to put
        if (col != n - 1) { //col is not the last col
            nKnight(board, row, col + 1, num); //same row next col, traversing
        } else {
            nKnight(board, row + 1, 0, num); //next row first col
        }

    }

    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nKnight(board, 0, 0, 0);
        System.out.println(maxKnights);
    }
}
