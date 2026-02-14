package Graph.Striver.Traversals.Questions;

import java.util.LinkedList;
import java.util.Queue;

// Different than Leetcode Number of Islands, in leetcode land will be taken by horizontally and vertically 4 directions
//in this question the land is taken even diagonally so in all 8 directions

// FOR FOUR DIRECTIONS CHECK PW SKILLS PACKAGE

public class NumberOfIslandsAllDirections {

//    This Question is also known as Number of Connected Components

    static class Pair{
        int row;
        int col;

        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public void bfs(int ro, int co, boolean[][] visited, char[][] grid){
        visited[ro][co] = true;
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(ro,co));

        int n = grid.length;
        int m = grid[0].length;

        while(!q.isEmpty()){
            Pair current = q.poll();
            // ro and co are starting point and there row and col are neighbouring cells
            int row = current.row;
            int col = current.col;

            //traverse in the neighbours and mark them if its a land
            for(int deltaRow = -1; deltaRow<=1; deltaRow++){
                for(int deltaCol=-1; deltaCol<=1; deltaCol++){

                    int neighRow = row + deltaRow;
                    int neighCol = col + deltaCol;

                    // Check for Validity, Land and Visited
                    if(neighRow>=0 && neighRow<n && neighCol>=0 && neighCol<m && grid[neighRow][neighCol]=='1' && !visited[neighRow][neighCol]){
                        visited[neighRow][neighCol] = true;
                        q.add(new Pair(neighRow,neighCol));
                    }
                }
            }
        }
    }

//  TC=O(N^2), SC=O(N^2)
    public int countIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m]; // 2D Visited Array

        int count = 0;

        for(int row = 0; row<n; row++){
            for(int col=0; col<m ; col++){
                if(!visited[row][col] && grid[row][col]=='1'){ //Validating Visited and Land
                    count++;
                    bfs(row,col,visited,grid);
                }
            }
        }
        return count; // number of islands
    }

}
