package Graph.DFS;

// Used on Directed Acyclic Graph

//-> Ordering of all nodes of the graph such that if a and b are nodes and a is connected to b then in the ordering
// a will always come before b.

import java.util.ArrayList;
import java.util.Collections;

public class TopologicalSort {

    // Do DFS one by one and add the neighbours of the node to the ans and also mark them true in the visited array & also
    // mark the node itself true and add into ans once its Recursion / DFS is completed.
    // reverse the ans you get the topological sort.

    //NOTE -> At the time of backtrack inert node into ans.

    public static void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans){

        visited[i] = true; //marking it true

        for(int v : adj.get(i)){
            if(!visited[v]){
                dfs(v, adj, visited, ans);
            }
        }

        ans.add(i); //adding in ans after recursion ends.
    }


    public static int[] topologicalSort(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i, adj, visited, ans);
            }
        }

        Collections.reverse(ans); //ans

        return ans.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

    }
}
