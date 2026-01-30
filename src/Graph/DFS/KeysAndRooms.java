package Graph.DFS;

import java.util.List;

//leetcode 841
public class KeysAndRooms {

    private void dfs(int start, List<List<Integer>> adj, boolean[] visited){
        visited[start] = true;
        for(int ele : adj.get(start)){
            if(!visited[ele]) dfs(ele,adj,visited);
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n]; // false by default
        visited[0] = true; //marking the starting point true
        // bfs(0,rooms,visited);

        dfs(0,adj,visited);
        for(boolean ele : visited){
            if(!ele) return false;
        }
        return true;
    }

}
