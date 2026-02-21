package Graph.DFS;

import java.util.ArrayList;
import java.util.List;

//leetcode 1971
public class FIndIfPathExists {

    class Solution {

        private void dfs(int source, int destination, List<List<Integer>> adj, boolean[] visited){
            visited[source] = true;
            for(int ele : adj.get(source)){
                if(visited[ele]!=true){
                    dfs(ele,destination,adj,visited);
                }
                if(ele==destination) return;
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

            // bfs(source,destination,adj,visited);

            dfs(source,destination,adj,visited);

            return visited[destination];
        }
    }
}
