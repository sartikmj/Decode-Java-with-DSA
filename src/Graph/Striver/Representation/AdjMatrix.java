package Graph.Striver.Representation;

public class AdjMatrix {

    public static void main(String[] args) {
        // Input in pairs those nodes which have edge between them

        //Use Matrix to store
        // if graph has 1 base indexing make a matrix of size n+1, n+1
        // if the nodes are from 1 to N then it is a 1 based indexing, if from 0 to N-1 then it is 0 based indexing

        //mark 1 in the cell with the nodes edges (m,n) and (n,m) for undirected graph

        // SC=O(n^2)

        int n = 3, m = 3;

        int[][] adj = new int[n+1][m+1];

//        NOTE:- If its a weighted graph instead of storing 1 store the weight of the edge between nodes u and v

        //edge 1---2
        adj[1][2] = 1;
        adj[2][1] = 1;

        //edge 2 -- 3
        adj[2][3] = 1;
        adj[3][2] = 1;

        //edge 1 -- 3
        adj[1][3] = 1;
        adj[3][1] = 1;

//        Storing for Undirected Graph
//        adj[u][v] = 1;
//        adj[v][u] = 1;
    }
}
