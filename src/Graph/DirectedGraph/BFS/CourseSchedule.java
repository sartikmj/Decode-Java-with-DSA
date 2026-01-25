package Graph.DirectedGraph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode 207
public class CourseSchedule {

    //Cleaner Code

    // We do not need visited array
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<>());

        int[] indegree = new int[numCourses];

        // u can also make adj like in second method below, it was easy and cleaner
        for (int i = 0; i < prerequisites.length; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            // b -> a edge
            adj.get(b).add(a);
            indegree[a]++;
        }

        //Kahn's Algo
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int front = q.poll();
            ans.add(front);

            for (int ele : adj.get(front)) {
                indegree[ele]--;
                if (indegree[ele] == 0) {
                    q.add(ele);
                }
            }
        }

        if (ans.size() == numCourses)
            return true;
        return false;
    }


    // Another way of writing same approach
    public boolean canFinish1(int numCourses, int[][] prerequisites) {

        //Creating Adj List
        int V = numCourses;
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        //the edges are opposite in this ques
        for(int[] i : prerequisites){
            int v = i[1];
            int u = i[0];

            adj.get(v).add(u);
        }


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

        // Step 4: Cycle Detection -> Means can not finish all courses
        if(ans.size() != V){
            return false;
        }
        //no cycle means can finish all courses
        return true;
    }

}
