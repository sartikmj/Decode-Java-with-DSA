package Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    //We have to tell number of Connected Components, just like number of provinces

    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    //instead of elements we will insrt pair of row and col in the queue
    private void bfs(int i, int j, char[][] grid, boolean[][] visited) {
        int m = grid.length, n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        visited[i][j] = true;
        while (!q.isEmpty()) {
            Pair front = q.remove();
            int row = front.row;
            int col = front.col;



            //top -> row-1 col
            if (row > 0) {
                if (visited[row - 1][col] == false && grid[row - 1][col] == '1') {
                    q.add(new Pair(row - 1, col));
                    visited[row - 1][col] = true;
                }
            }

            //bottom -> row+1 col
            if (row + 1 < m) {
                if (visited[row + 1][col] == false && grid[row + 1][col] == '1') {
                    q.add(new Pair(row + 1, col));
                    visited[row + 1][col] = true;
                }
            }

            //left row col-1
            if (col > 0) {
                if (visited[row][col - 1] == false && grid[row][col - 1] == '1') {
                    q.add(new Pair(row, col - 1));
                    visited[row][col - 1] = true;
                }
            }

            //right row col+1
            if (col + 1 < n) {
                if (visited[row][col + 1] == false && grid[row][col + 1] == '1') {
                    q.add(new Pair(row, col + 1));
                    visited[row][col+1] = true;
                }
            }
        }
    }

    //TC=O(M*N) AS=O(M*N)
    public int numIslands(char[][] grid) { //1 is land
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(i, j, grid, visited); // i and j are row and col
                    count++;
                }
            }
        }
        return count;
    }

}
