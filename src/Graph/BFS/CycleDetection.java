package Graph.BFS;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class CycleDetection {

    //In queue we will pass the ele and also its parent in order to mke the condition that detects the cycle

    class Pair{
        int node;
        int parent;

        Pair(int node, int parent){
            this.node = node;
            this.parent = parent;
        }
    }


//  NOT NEEDED HERE
    // private ArrayList<ArrayList<Integer>> matrixToList(int V, int[][] edges){



    //     //Step 1: Converting adj matrix to adj list
    //     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    //     //Initialize empty list for each vertex
    //     for(int i=0;i<V;i++){
    //         adj.add(new ArrayList<>());
    //     }

    //     //Convert Matrix into List
    //     for(int i=0;i<edges.length;i++){
    //         for(int j=0;j<edges[i].length;j++){
    //             if(edges[i][j] == 1)
    //             adj.get(i).add(j);
    //         }
    //     }

    //     return adj;
    // }


    private ArrayList<ArrayList<Integer>> buildAdjList(int V, int[][] edges){

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i< edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return adj;
    }

    private boolean bfsCycleCheck(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited){

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(start,-1));

        visited[start] = true;

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int node = curr.node;
            int parent = curr.parent;

            for(int neighbor : adj.get(node)){

                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.offer(new Pair(neighbor, node));
                }
                else if(neighbor != parent){
                    return true; //cycle detected;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, int[][] edges) {
        // Code here

        //edges is 2D array with the vertices which are connected together
        //where eges[i] = [u,v]

        //Step 1: Edge List -> Adj List
        ArrayList<ArrayList<Integer>> adj = buildAdjList(V,edges);

        //Step 2: Cycle Detection

        boolean[] visited = new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i]){ // visited[i] == false
                if(bfsCycleCheck(i, adj, visited)){
                    return true;
                }
            }
        }

        return false;
    }

}
