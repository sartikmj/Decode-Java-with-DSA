package Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

//leetcode 547
public class NumberOfProvinces {

    //based on connected components

    //Jitni baar bfs laga utne components

    private void bfs(int i, boolean[] visited, int[][] adj){
        int n = adj.length;
        visited[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front = q.poll();
            //adding the front connected nodes to queue
            for(int j=0;j<n;j++){
                if(adj[front][j]==1 && visited[j]==false){ //means front is connected to j and not visited
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }

//    TC=O(n^2) for adj matrix
//    general case TC=O(V + 2E) for adj list
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, visited, adj);
                count++;
            }
        }
        return count;
    }


}
