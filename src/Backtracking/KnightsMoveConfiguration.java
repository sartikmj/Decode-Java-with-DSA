package Backtracking;

// leetcode 2596
public class KnightsMoveConfiguration {

    public boolean helper(int[][] grid, int row, int col, int num) {
        int n = grid.length;
        //base case
        if (grid[row][col] == n * n - 1) return true;
        int i, j;
        // 2Up + 1Right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        //2Up + 1Left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) {
            return helper(grid, i, j, num + 1);
        }

        //2Down + 1Right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2Down + 1Left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2Right + 1Up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2Right + 1Down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2Left + 1Up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        //2Left + 2Down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1);

        return false; //if we don't find number anywhere
    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;
        return helper(grid, 0, 0, 0);
    }
}
