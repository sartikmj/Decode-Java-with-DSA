package Trees.BinaryTree.Questions.BFSQuestions;

import java.util.LinkedList;
import java.util.Queue;

// Leetcode 102

public class BFSUsingQueueLeetcode {

//    we want that after every level we get a new line for new level.

//    We will use OOPS, we will make Queue which will store a pair of datatype, the node and the level.

    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    //In copy also write the code on leetcode for this problem Leetcode 102

    //on Leetcode we named this method as BFS -> but we do not to have any Enter there for each level

//    TC=O(n), n = Number of Nodes, SC=O(n), bcz all the elements of Node are inside queue once.
    public static void levelOrder(Node root){
        int prevlvl = 0; //to print different levels in different lines
        Queue<Pair> q = new LinkedList<>(); //Queue of datatype pair.
        if(root != null) q.add(new Pair(root,0)); //mean-> Pair p = new Pair(root,0);
        while(!q.isEmpty()){
            Pair front = q.remove();
            Node tempNode = front.node;
            int lvl = front.level;
            if(lvl != prevlvl){
                System.out.println(); //next line
                prevlvl++; //prevlvl increased
            }
            System.out.print(tempNode.val+" ");
            if(tempNode.left != null) q.add(new Pair(tempNode.left, lvl+1)); //inserting the Pair with root.left and lvl+1
            if(tempNode.right != null) q.add(new Pair(tempNode.right, lvl+1));
        }
    }

}
