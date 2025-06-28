package Trees.BinarySearchTree.Questions;

//Leetcode 700
public class SearchInBST {

    //If we search the entire tree TC=O(n)
    //In BST we do not need to search the entire tree.

    //Best case = O(log n) -> in Balanced Binary Tree.
    //Avg and Worst = O(h), h-> height of the tree.

    public Node searchBST(Node root, int val) {
        if (root == null) return null;

        if (root.val < val) return searchBST(root.right, val);
        else if (root.val > val) return searchBST(root.left, val);
        else return root; //root.val == val
    }
}
