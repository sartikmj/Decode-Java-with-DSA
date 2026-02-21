package Backtracking;

public class RatInDeadMaze4Direction {

    //Same Question as Rat in a Dead Maze but you can actually go in 4 directions
    // right left up and down

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        int[][] maze = {
                {1,0,1,1}, //rat can only pass through the 1's and 0's are blocked paths
                {1,1,1,1},
                {1,1,0,1}
        };

        boolean[][] visited = new boolean[rows][cols];

        print(0,0,rows-1,cols-1,"",maze,visited);
    }

    public static void print(int sr, int sc, int er, int ec, String s, int[][] maze, boolean[][] visited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return; //can not go further in that direction.

        if(visited[sr][sc]==true) return; //check

        visited[sr][sc]=true; //marking true

        //go right
        print(sr,sc+1,er,ec,s+'R',maze,visited);
        //go down
        print(sr+1,sc,er,ec,s+'D',maze,visited);
        //go left
        print(sr,sc-1,er,ec,s+'U',maze,visited);
        //go up
        print(sr-1,sc,er,ec,s+'U',maze,visited);

        visited[sr][sc]=false;
    }

}
