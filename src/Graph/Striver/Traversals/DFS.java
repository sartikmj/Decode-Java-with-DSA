package Graph.Striver.Traversals;

import java.util.ArrayList;

public class DFS {

//    TC=O(n) + 2E,  SC = O(n)

    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs){

        //marking current node as visited
        visited[node] = true;
        dfs.add(node);

        //getting neighbours nodes
        for(int i : adj.get(node)){
            if(!visited[i]){
                dfs(i, visited, adj, dfs); //recursion for dfs
            }
        }
    }

    // Function to return a list containing the DFS traversal of the graph
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        //if V is not given
//        int V = adj.size();

        //boolean array to keep track of visited vertices
        boolean[] visited = new boolean[V]; // V+1 if the graph is 1 based indexed, and in recursion/ visited array start from 1.

        ArrayList<Integer> dfs = new ArrayList<>();

        for(int i=0;i< V;i++){ // bcz of this loop the dfs also works for graphs with disconnected components
            if(!visited[i]){
                dfs(i, visited, adj, dfs);
            }
        }

        return dfs;
    }
}
