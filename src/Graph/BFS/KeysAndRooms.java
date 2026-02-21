package Graph.BFS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetcode 841
public class KeysAndRooms {

    private void bfs(int start, List<List<Integer>> rooms, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int front = q.poll();
            for(int ele : rooms.get(front)){
                if(!visited[ele]){
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }
    }

//    TC=O(V + E) AS=O(N)
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n]; // false by default
        visited[0] = true; //marking the starting point true
        bfs(0,rooms,visited);

        for(boolean ele : visited){
            if(!ele) return false;
        }
        return true;
    }

}
