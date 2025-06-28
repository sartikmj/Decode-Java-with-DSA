package Trees.BinaryTree.Leetcode;

//Leetcode 104
public class MaximumDepthOfBinaryTree {
    public int height(Node root){
        if(root==null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public int maxDepth(Node root) {
        return height(root);
    }
}
