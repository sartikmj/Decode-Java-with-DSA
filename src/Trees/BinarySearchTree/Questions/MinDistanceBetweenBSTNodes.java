package Trees.BinarySearchTree.Questions;

//Leetcode 783 also same as leetcode 530
public class MinDistanceBetweenBSTNodes {

    //Find Min Difference Between the Nodes of BST (Adjacent Nodes)

    Integer prev = null;
    int minDiff = Integer.MAX_VALUE;

    public void inorder(Node root){
        if(root==null) return;

        inorder(root.left);

        if(prev!=null){
            minDiff = Math.min(minDiff,root.val - prev);
        }

        prev = root.val;

        inorder(root.right);
    }
    public int minDiffInBST(Node root) {
        inorder(root);
        return minDiff;
    }

}
