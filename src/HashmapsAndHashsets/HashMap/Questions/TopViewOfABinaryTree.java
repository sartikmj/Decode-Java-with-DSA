package HashmapsAndHashsets.HashMap.Questions;

import java.util.*;

public class TopViewOfABinaryTree {

    //We will make a queue of Pair datatype contains Node.val,level.
    //now we will use a HashMap with <Integer,Integer> that will store <level,node.val>
    //now we will traverse tree with BFS and while storing the pairs in queue we will level-- going to LST and level++ going to RST
    //(we are using vertical levels)
    //now we will check in HashMap if the level does not exist we will add that level with node.val in map if it already exists we won't
    //we will keep a track of minLevel and maxLevel
    //then traverse from minLevel to maxLevel to get the ans in right order

    //TC=O(n), SC=O(n)
    public static class Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node = node;
            this.level = level;
        }
    }

    public static void topView(Node root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        int minLevel = Integer.MAX_VALUE;
        int maxLevel = Integer.MIN_VALUE;
        //BFS
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair front = q.poll();
            Node node = front.node;
            int level = front.level;
            //storing min and max level
            minLevel = Math.min(minLevel,level);
            maxLevel = Math.max(maxLevel,level);
            if(!map.containsKey(level)){ //if this level does not exist
                map.put(level,node.data); //adding level and node value in map
            }
            if(node.left!=null) q.add(new Pair(node.left,level-1)); //inserting left child in queue with its level.
            if(node.right!=null) q.add(new Pair(node.right,level+1)); //inserting right child in queue with its level.
        }
        //we have got our top view inside the map

        //traversing the hashmap in order of levels
        for(int i=minLevel;i<=maxLevel;i++){
            System.out.print(map.get(i)+" ");
        }

    }
}
