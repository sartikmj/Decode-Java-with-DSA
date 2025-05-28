package Trees.BinaryTree.Questions.DFSQuestions;

public class DiameterOfBinaryTree {
    //Leetcode 543

//    Calculate levels of LST + RST + 1(root node), then to calculate longest path
//    i.e., edges, levels-1. So just don't add 1 for root
//    so we can say:
//    diameter = levels of LST + levels of RST

//    We will find the diameter with every Node taken as root, the one with mex value will be our diameter.
//    Taking a node as root means that the diameter i.e., the longest path will pass through that Node and reverse
//    from there

//    TC=O(n^2) -> can be done in O(n)

    public int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }

    public int diameterOfBinaryTree(Node root) {
        if(root==null) return 0;
        int myDia = levels(root.left) + levels(root.right); //Longest path of current Root
        int leftDia = diameterOfBinaryTree(root.left); //calculating longest path for left node
        int rightDia = diameterOfBinaryTree(root.right); // calculating longest path for right node
        //Returning Maximum of all the paths for every node as root, as it is the Diameter
        return Math.max(myDia,Math.max(leftDia,rightDia));
    }

//    Better Approach from leetcode

    static int res = 0;

    public int diameterOfBinaryTree1(Node root) {
        dfs(root);
        return res;
    }

    private int dfs(Node root) {
        if (root == null) {
            return 0;
        }

        int l = dfs(root.left);
        int r = dfs(root.right);

        res = Math.max(res, l + r);

        return 1 + Math.max(l, r);
    }

}
