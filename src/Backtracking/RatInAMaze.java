package Backtracking;

//

//in this version of this question the Rat can move in all 4 directions
public class RatInAMaze {

    //we will use an extra 2D array to use as flag to mark the place where the rat has been, so the rat does not get back
    //to that place again.
    //Initially the 2D array will be filled with False

    //If you only want to move right and down you do not need to use that visited array or backtracking

    public static void print(int sr, int sc, int er, int ec, String s, boolean[][] visited){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(visited[sr][sc] == true) return; //very important, already visited
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }

        visited[sr][sc] = true;
        //go right
        print(sr,sc+1,er,ec,s+'R',visited);
        //go down
        print(sr+1,sc,er,ec,s+'D',visited);
        //go left
        print(sr,sc-1,er,ec,s+'U',visited);
        //go up
        print(sr-1,sc,er,ec,s+'U',visited);

        visited[sr][sc] = false; //backtrack
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] visited = new boolean[rows][cols]; // by default -> false

        print(0,0,rows-1,cols-1, "", visited);
    }
}
