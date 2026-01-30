package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//leetcode 1971
public class FindIfPathExists {

    private void bfs(int source, int destination, List<List<Integer>> adj, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int front = q.poll();
            for(int ele : adj.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele] = true;
                    if(ele==destination) return;
                }
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination) return true;
        List<List<Integer>> adj = new ArrayList<>();
        //making adj list
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }

        for(int i=0;i<edges.length;i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] visited = new boolean[n];

        bfs(source,destination,adj,visited);

        return visited[destination];
    }
}
