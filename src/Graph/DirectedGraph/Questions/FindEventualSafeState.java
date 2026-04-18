package Graph.DirectedGraph.Questions;

import java.util.*;

//leetcode 802
public class FindEventualSafeState {

    // Any node which comes in a cycle is not a safe state

//    All the questions in which Find all the nodes which are not part of the cycle
//    The same approach will be used.


    // Step 1: Reverse the Graph, now we will calculate the indegrees, which in real graph are there outdegrees
    // Step 2: Apply Kahn's Algorithm
    // Step 3: You will get the ans in the array, bcz only those nodes will be present in the ans array, others will not
    // bcz their indegree will not become zero

//    INTUTION
//    Ques is find all nodes which are not part of the cycle
//    hence in Kahn's we find nodes which are part of cycle

//    Extra : if u want to find nodes that are the part of the cycle its all the nodes other than the ans this question

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>(); //adj list of reverse graph
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        int[] indegree = new int[n];

        // reverse the graph
        for(int i=0;i<n;i++){
            for(int ele : graph[i]){
                // in original graph edge is from i to ele,
                // in reverse graph it will be from ele to i

                adj.get(ele).add(i);
                indegree[i]++;
            }
        }

        //Apply Kahn's Algorithm
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.offer(i);
        }

        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){
            int front = q.poll();
            ans.add(front);

            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }
        Collections.sort(ans); //asked in ques that ans should be in sorted order

        return ans;
    }
}
