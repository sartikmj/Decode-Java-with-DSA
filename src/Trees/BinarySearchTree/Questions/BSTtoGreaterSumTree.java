package Trees.BinarySearchTree.Questions;

//Leetcode 1038
public class BSTtoGreaterSumTree {

    static int sum;
    private void reverseInorder(Node root){
        if(root == null) return;
        reverseInorder(root.right);
        sum+=root.val;
        root.val = sum;
        reverseInorder(root.left);
    }
    public Node bstToGst(Node root) {
        sum=0;
        reverseInorder(root);
        return root;
    }
}
