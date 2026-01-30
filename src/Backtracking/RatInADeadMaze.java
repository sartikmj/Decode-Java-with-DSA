package Backtracking;

public class RatInADeadMaze { //also known as Rat In a Maze 3

//    Question
//    A mazr is N*N binary matrix of blocks where the upper left block is known as the Source Block, and the
//    lower right most block is known as the Destination Block. If we consider the maze, then maze[0][0] is the source
//    and maze[n-1][n-1] is the destination. Our main task is to reach the destination from source.
//    We have considered a rat as a character that can move either forward or downwards.

//    In the maze matrix, a few dead blocks will be denoted by 0 and active blocks will be denoted by 1.
//    A rat can move only in the active blocks.

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        print(0,0,rows-1,cols-1,"",maze);
    }

    public static void print(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return; //can not go further in that direction.

        //go right
        print(sr,sc+1,er,ec,s+'R',maze);
        //go down
        print(sr+1,sc,er,ec,s+'D',maze);
    }

}
