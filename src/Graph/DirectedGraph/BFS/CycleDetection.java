package Graph.DirectedGraph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleDetection {

//    -> In a Directed Acyclic Graph, when we apply topological sort -> BFS(Kahn's Algo)
//    -> We visit 'all' the nodes.
//    So if we have Directed Cyclic Graph and we apply topological sort, then something unusual happens

//    In Directed Acyclic after applying topological sort the ans list is of size equal to numbers of nodes in graph.

//    NOTE:- IF THERE IS NO NODE WITH INDEGREE 0 THEN ITS MUST THAT THERE IS A CYCLE IN THE GRAPH.

//    TO FIND CYCLE
//    Appy Kahn's Algo and if the size of ans list is less than the total number of nodes it means there is a cycle.


    public static boolean topologicalSort(int V, List<List<Integer>> adj){
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
            return true;
        }

        return false;
    }


}
