package Graph.DFS;

import java.util.List;

public class DFS {

    public static void dfs(int i, boolean[] visited, List<List<Integer>> ans){

        visited[i] = true;
        System.out.println(i + " ");

        for(int nbr : ans.get(i)){
            if(!visited[nbr]){
                dfs(nbr, visited, ans);
            }
        }
    }

    public static void main(String[] args) {

    }
}
