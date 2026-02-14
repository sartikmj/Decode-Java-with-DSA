package Graph.DirectedGraph.BFS.KahnsAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode 210
public class CourseSchedule2 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<>());

        int[] indegree = new int[numCourses];

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

        int[] x = new int[ans.size()];
        if (ans.size() == numCourses){
            for(int i=0;i<ans.size();i++){
                x[i] = ans.get(i);
            }
            return x;
        }
        return new int[0]; //returning empty array
    }
}
