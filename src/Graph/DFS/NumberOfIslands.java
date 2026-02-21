package Graph.DFS;

//leetcode 200
public class NumberOfIslands {

    private void dfs(int i, int j, char[][] grid, boolean[][] visited){
        visited[i][j] = true;
        int m = grid.length, n = grid[0].length;
        if(i-1>=0 && grid[i-1][j]=='1' && visited[i-1][j]==false) dfs(i-1,j,grid,visited); //up
        if(i+1<m && grid[i+1][j]=='1' && visited[i+1][j]==false) dfs(i+1,j,grid,visited); //down
        if(j-1>=0 && grid[i][j-1]=='1' && visited[i][j-1]==false) dfs(i,j-1,grid,visited); //left
        if(j+1<n && grid[i][j+1]=='1' && visited[i][j+1]==false) dfs(i,j+1,grid,visited); //right
    }

    public int numIslands(char[][] grid) { //1 is land
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    // bfs(i, j, grid, visited); // i and j are row and col
                    dfs(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
    }
}
