package Graph.Striver.Traversals.Questions;

import java.util.ArrayList;

//leetcode 547
public class NumberOfProvinces {

//    For BFS approach check the PWSkills module
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, boolean[] visited){
        visited[node] = true;
        for(int i : adjList.get(node)){
            if(!visited[i]){
                dfs(i, adjList, visited);
            }
        }
    }

//    TC=O(N)+O(V + 2E), SC=O(N)
    static int numberOfProvinces(ArrayList<ArrayList<Integer>> adj, int V){ //adj is given adj matrix

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }

        // to change adjacency matrix to List
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(adj.get(i).get(j) == 1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[V];

        int count = 0;

        for(int i=0;i<V;i++){
            if(!visited[i]){
                count++;
                dfs(i,adjList,visited);
            }
        }

        return count;
    }
}
