package Graph.Striver.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    // SC=O(3*n) == O(n)
    // TC=O(N) + O(2E)

    //Function to traverse bfs traversal of given graph
    public ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj) { // if not given V = adj.size()

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0); //first node, as it is 0 based indexing graph, if it is a 1 based indexing add 1
        visited[0] = true;

        while(!q.isEmpty()){

            int node = q.poll();

            bfs.add(node);

            // pushing its neighbours in queue
            for(int i : adj.get(node)){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }

        return bfs;
    }
}
