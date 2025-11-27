package Trees.BinaryTree.Leetcode;

public class CountCompleteTreeNodes {
    public void count(Node root, int[] c) {
        if (root == null) return;
        c[0]++;
        count(root.left, c);
        count(root.right, c);
    }

    public int countNodes(Node root) {
        int[] c = {0};
        count(root, c);
        return c[0];
    }
}
