package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


// Used on Directed Acyclic Graph

// Topological Sort using BFS -> Kahn's Algorithm

public class TopologicalSort {

    // we will calculate indegree of each node, i.e, the number of edges incoming
    //the node with most edges incoming will come at the last of the topo sort and the one with the least incoming come at the first

    //Now have a queue for BFS

    //First, insert the node with least i.e, 0 indegree in the queue
    //then we will take it out of the queue and add it to the ans
    // then we go to its neighbors and reduce their indegrees by one and if the indegree of the neighbour becomes 0
    // we will insert it in the queue next, if indegree does not become zero we will not push it to the queue.


//    🔹 Step-by-Step Algorithm
//
//    Compute in-degree of all nodes
//
//    Push all nodes with in-degree 0 into a queue
//
//    While queue not empty:
//
//    Pop node
//
//    Add it to topo order
//
//    For each neighbor:
//
//    Decrease in-degree
//
//    If in-degree becomes 0 → push into queue
//
//    If topo size < V → cycle exists

    public static List<Integer> topologicalSort(int V, List<List<Integer>> adj){
        int[] indegree = new int[V];

        // Step 1: Calculate Indegree
        for(int i=0;i<V;i++){
            for(int v : adj.get(i)){
                indegree[v]++;
            }
        }

        // Step 2: Push nodes with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0) q.offer(i);
        }

        //Step 3: BFS
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);

            for(int nbr : adj.get(node)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.offer(nbr);
                }
            }
        }

        // Step 4: Cycle Detection
        if(ans.size() != V){
            System.out.println("Not possible as there is Cycle");
            return new ArrayList<>();
        }

        return ans;
    }


}
