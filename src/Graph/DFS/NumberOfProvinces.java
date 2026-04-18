package Graph.DFS;

//leetcode 547
public class NumberOfProvinces {

    private void dfs(int i, boolean[] visited, int[][] adj) {
        int n = adj.length;
        visited[i] = true;
        //do dfs on all nodes connected with i
        for (int j = 0; j < n; j++) {
            if (adj[i][j] == 1 && visited[j] == false) { //means front is connected to j and not visited
                dfs(j,visited,adj);
                //we do not need a base case as the condition of visited array will stop the recursion
            }
        }
    }

    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                // bfs(i, visited, adj);
                dfs(i, visited, adj);
                count++;
            }
        }
        return count;
    }

}
