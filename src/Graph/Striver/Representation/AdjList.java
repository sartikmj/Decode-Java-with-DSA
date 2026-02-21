package Graph.Striver.Representation;

import java.util.ArrayList;

public class AdjList {


    public static void main(String[] args) {

        //SC = O(2 * Edges)

        int n = 3, m = 3;

//        NOTE:-
        // If its a weighted graph instead of the node number we will add Pairs of Node, Weight in the ArrayList
        // the Data Type of the list would be Pair


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // n+1
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        // edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1); // if it is a directed graph you will remove this line


//        adj.get(u).add(v);
//        adj.get(v).add(u);

        //edge 2 -- 3
        adj.get(2).add(3);
        adj.get(3).add(2); // if it is a directed graph you will remove this line

        //edge 1 -- 3
        adj.get(1).add(3);
        adj.get(3).add(1); // if it is a directed graph you will remove this line

        for(int i=1; i<=n; i++){
            for(int j=0;j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
