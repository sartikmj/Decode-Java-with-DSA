package Graph.DirectedGraph;

import java.util.ArrayList;
import java.util.List;

public class EdgeListToAdjList {

    public static List<List<Integer>> buildAdjList(int V, int[][] edges) {
        // Step 1: Create adj list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Add edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v); // u -> v
        }

        return adj;
    }

}
