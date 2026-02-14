package Graph.Striver.Traversals.Questions;

import java.util.Queue;
import java.util.LinkedList;

//leetcode 733
public class FloodFill {


    // BY ME AND CHATGPT
    static class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    // we do not need visited array bcz in the if condition which is inside for loop we already checking if(image[nrow][ncol]==ogColor) so it will never let bfs go to the same cell again once it is changed when visited
    public void bfs(int r, int c, int[][] image, int color, /*boolean[][] visited,*/ int ogColor){
        image[r][c] = color; //coloring the current starting cell
        // visited[r][c] = true; // marking the starting cell visited
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(r,c));

        int n = image.length;
        int m = image[0].length;

        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        while(!q.isEmpty()){
            Pair current  = q.poll();

            // ro and co are starting point and there row and col are neighbouring cells
            int row = current.row;
            int col = current.col;

            // traverse
            for(int i=0;i<4;i++){ //traverse in 4 directions only
                int nrow = row + drow[i];
                int ncol = col + dcol[i];

                //checking validity and visited and color
                if(nrow>=0 && nrow < n && ncol>=0 && ncol<m && /*!visited[nrow][ncol] &&*/ image[nrow][ncol]==ogColor){
                    image[nrow][ncol] = color;
                    // visited[nrow][ncol] = true;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ogColor = image[sr][sc];
        if(ogColor == color) return image;
        int n = image.length;
        int m = image[0].length;
        // boolean[][] visited = new boolean[n][m];
        bfs(sr, sc, image, color, /*visited,*/ ogColor);

        return image;
    }


}
