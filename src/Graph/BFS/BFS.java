package Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

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
}
