package Trees.BinaryTree.Questions;

//Leetcode 105
public class ConstructBTFromInorderAndPreorder {
    public Node helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi) {
        //Base Case
        if (prelo > prehi || inlo > inhi) return null;
        Node root = new Node(preorder[prelo]); //Don't write preorder[0], bcz root value will keep changing.
        int r = 0;
        while (inorder[r] != preorder[prelo]) r++; //r refers to root element.
        int leftsize = r - inlo;
        root.left = helper(preorder, inorder, prelo + 1, prelo + leftsize, inlo, r - 1);
        root.right = helper(preorder, inorder, prelo + leftsize + 1, prehi, r + 1, inhi); //they both will give left subtree and right subtree roots.
        // Which is getting attached to left and right of the root.
        return root;
    }

    public Node buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;

        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
    }
}
