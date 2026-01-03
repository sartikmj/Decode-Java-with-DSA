package Trees.BinaryTree.Questions.DFSQuestions;

public class DiameterOfBinaryTree {
    //Leetcode 543

//    Calculate levels of LST + RST + 1(root node), then to calculate longest path
//    i.e., edges, levels-1. So just don't add 1 for root
//    so we can say:
//    diameter = levels of LST + levels of RST

//    We will find the diameter with every Node taken as root, the one with max value will be our diameter.
//    Taking a node as root means that the diameter i.e., the longest path will pass through that Node and reverse
//    from there

//    TC=O(n^2) -> can be done in O(n)

    //    Brute Force
    public int levels1(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels1(root.left), levels1(root.right)); // root + max of left or right nodes
    }

    public int diameterOfBinaryTree1(Node root) {
        if (root == null) return 0;
        int myDia = levels1(root.left) + levels1(root.right); //Longest path of current Root
        int leftDia = diameterOfBinaryTree1(root.left); //calculating longest path for left node
        int rightDia = diameterOfBinaryTree1(root.right); // calculating longest path for right node
        //Returning Maximum of all the paths for every node as root, as it is the Diameter
        return Math.max(myDia, Math.max(leftDia, rightDia));
    }

//    Optimal TC=O(n)
//    we are already traversing and getting all the levels in the method of levels, we don't need to traverse again.

    public int levels(Node root, int[] maxDia){
        if(root==null) return 0;
        int leftLevels = levels(root.left,maxDia);
        int rightLevels = levels(root.right,maxDia);
        int dia = leftLevels + rightLevels; //finding diameter for every root, we have calculated the left and right levels so we can calculated dia for this root.
        maxDia[0] = Math.max(maxDia[0],dia);
        return 1 + Math.max(leftLevels,rightLevels);
    }
    public int diameterOfBinaryTree(Node root) {
        int[] maxDia = {0};
        levels(root,maxDia);
        return maxDia[0];
    }
}
