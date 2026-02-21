package Backtracking;

public class RatInaDeadMazeOptimized {

    //Same rat in a dead maze questions with 4 directions, but it is Space Optimized
    //instead of making a new visited 2D array, we will use the already given array,
    //where there is 1 and it is visited we will mark it -1 which will show it is already visited

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        int[][] maze = {
                {1,0,1,1}, //rat can only pass through the 1's and 0's are blocked paths
                {1,1,1,1},
                {1,1,0,1}
        };

        print(0,0,rows-1,cols-1,"",maze);
    }

    public static void print(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return; //can not go further in that direction , Blocked

        //check
        if(maze[sr][sc]==-1) return;

        maze[sr][sc] = -1; //marking visited

        //go right
        print(sr,sc+1,er,ec,s+'R',maze);
        //go down
        print(sr+1,sc,er,ec,s+'D',maze);
        //go left
        print(sr,sc-1,er,ec,s+'U',maze);
        //go up
        print(sr-1,sc,er,ec,s+'U',maze);

        //backtracking
        maze[sr][sc]=1;

    }
}
