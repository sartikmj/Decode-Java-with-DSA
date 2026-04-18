package Graph.BFS;

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

//leetcode 785
public class isBipartite {

//    matrix[] graph is an adjacency list
//    The Input: graph = [[1,3], [0,2], [1,3], [0,2]]
//
//    The Meaning: * Node 0 is connected to nodes 1 and 3.
//
//    Node 1 is connected to nodes 0 and 2.
//
//    Node 2 is connected to nodes 1 and 3.
//
//    Node 3 is connected to nodes 0 and 2.

    static boolean ans;
    public void bfs(int i, int[][] adj, int[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = 0;
        while(!q.isEmpty()){
            int front = q.poll();
            int color = visited[front];

            for(int ele : adj[front]){
                if(visited[ele] == visited[front]){
                    ans = false;
                    return;
                }
                if(visited[ele] == -1){
                    visited[ele] = 1-color; // to swap error
                    q.add(ele);
                }
            }
        }
    }
    public boolean isBipartite(int[][] adj) {
        ans = true;
        //graph is adjacency list here
        int n = adj.length;
        int[] visited = new int[n];

        Arrays.fill(visited,-1);

        // 1 -> Red, 0 -> Blue

        for(int i=0;i<n;i++){

            if(ans == false) return ans;

            if(visited[i] == -1){
                bfs(i,adj,visited);
            }
        }
        return ans;
    }

}
