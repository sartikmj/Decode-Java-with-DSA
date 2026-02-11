package Graph.DirectedGraph.Questions;

import java.util.*;

public class AlienDictionary {

    //Topological Sort Question

    // We will try to make a directed graph

    //Can improve the code for not possible to find the order, or invalid dict, or has cycle in the graph we made

    class Solution {
        public String findOrder(int k,String[] words) {
            // code here

            int n = words.length;
            List<List<Integer>> adj = new ArrayList<>();

            //Step 1: Initialising Adj List
            for(int i=0;i<k;i++){
                adj.add(new ArrayList<>());
            }

            //Step 2: Build Graph
            for(int i=0;i<n-1;i++){
                String s1 = words[i];
                String s2 = words[i+1];
                int len = Math.min(s1.length(),s2.length());

                for(int ptr=0;ptr<len;ptr++){
                    char c1 = s1.charAt(ptr);
                    char c2 = s2.charAt(ptr);

                    if(c1 != c2){
                        adj.get(c1-'a').add(c2-'a');
                        break; //only first mismatch matters
                    }
                }
            }

            // Step 3: Indegree Array
            int[] indegree = new int[k];
            for(int i=0;i<k;i++){
                for(int neigh : adj.get(i)){
                    indegree[neigh]++;
                }
            }

            // Step 4 : Kahn's Algo (BFS) to determine the correct order of Dictionary
            Queue<Integer> q = new LinkedList<>();
            for(int i=0;i<k;i++){
                if(indegree[i]==0){
                    q.offer(i);
                }
            }

            StringBuilder ans = new StringBuilder();
            while(!q.isEmpty()){
                int node = q.poll();
                ans.append((char)(node+'a')); // + 'a', to convert the index into alphabet

                for(int neigh : adj.get(node)){
                    indegree[neigh]--;
                    if(indegree[neigh] == 0){
                        q.offer(neigh);
                    }
                }
            }

            return ans.toString();

        }
    }

}
