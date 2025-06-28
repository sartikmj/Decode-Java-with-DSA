package Trees.BinarySearchTree.Questions;

//Leetcode 235
public class LCAofBST {

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) return null;
        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        else if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);

        return root; //when p < r < q || p> r >
    }
}
