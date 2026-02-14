package DynamicProgramming.DPOnTrees;

import java.util.HashMap;

public class DiameterOfBinaryTree {

    //Memoization using HashMap

    //NOTE -> here path means number of edges so after finding levels we will - 1 from them
    // diameter - n - 1, n-> number of nodes in the path

    //Recursive Code
    // TC=O(n^2)
    public int levels(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right)); // root + max of left or right nodes
    }

    public int diameterOfBinaryTree1(Node root) {
        if (root == null) return 0;
        int myDia = levels(root.left) + levels(root.right); //Longest path of current Root
        int leftDia = diameterOfBinaryTree1(root.left); //calculating longest path for left node
        int rightDia = diameterOfBinaryTree1(root.right); // calculating longest path for right node
        //Returning Maximum of all the paths for every node as root, as it is the Diameter
        return Math.max(myDia, Math.max(leftDia, rightDia));
    }

    //Memoization
    //We will Memoize using HashMap

    // Map<TreeNode, Integer> dp -> Integer will store levels of that TreeNode
    //TC=O(n) AS=O(n)
    public int levels(Node root, HashMap<Node,Integer> dp){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        dp.put(root, 1 + Math.max(levels(root.left,dp), levels(root.right,dp)));
        return dp.get(root);
    }
    public int diameter(Node root, HashMap<Node,Integer> dp) {
        if(root==null) return 0;
        int myDia = levels(root.left, dp) + levels(root.right, dp);
        int leftDia = diameter(root.left, dp);
        int rightDia = diameter(root.right, dp);

        return Math.max(myDia, Math.max(leftDia, rightDia));
    }

    public int diameterOfBinaryTree(Node root){
        HashMap<Node,Integer> dp = new HashMap<>();
        return diameter(root,dp);
    }

    // Without Memoization , Not even Tabulation but still DP
    //We will store the every Diameter and keep checking which is the maximum while calc the levels and return it

    //TC=O(n) AS=O(h) -> height of the tree
    //If you want to pass maxDia in the method we have to make an array of size 1.
    //OR you can make a variable of data type Integer. generics/wrapper class are pass by reference
//    static int maxDia; //declaring maxDia to store max diameter value.
    public int levels1(Node root, int[] maxDia){
        if(root==null) return 0;
        int leftLevels = levels1(root.left, maxDia);
        int rightLevels = levels1(root.right, maxDia);
        int myDia = leftLevels + rightLevels; //extra , just these two lines are added new
        maxDia[0] = Math.max(maxDia[0], myDia); //extra
        return 1 + Math.max(leftLevels, rightLevels);
    }

    public int diameterOfBinaryTreeDP(Node root) {
//        maxDia = 0;
        int[] maxDia = {0};
        levels1(root, maxDia);
        return maxDia[0];
    }
}
