package Graph;

import java.util.ArrayList;

public class AdjacencyMatrixToList {

    //Works for both Directed and Undirected Graph
    public static ArrayList<ArrayList<Integer>> matrixToList(int[][] matrix){

//        IMPORTANT
//        If V i.e. Vertices is given in question as parameter then use it as V do not use the below one.
        int V = matrix.length; //vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        //Initialise adjacency list
        //It initializes the adjacency list for each vertex.
        //You are creating V empty lists, one for each node.
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        //Convert Matrix into List
        //if V is given use that, if V is not given and u calculate it like above then u can use V here
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }
        return adj;
    }

}
