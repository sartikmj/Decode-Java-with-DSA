package Trees.BinaryTree.Questions;

//Leetcode 110
public class BalancedBT {
    //    For every root difference of levels between Left sub tree and right sub tree is <=1.
    public int levels1(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels1(root.left), levels1(root.right));
    }

    //    Brute Force
    public boolean isBalanced1(Node root) {
        if (root == null) return true;
        int diff = Math.abs(levels1(root.left) - levels1(root.right));
        if (diff > 1) return false;
//        boolean LST = isBalanced(root.left);
//        if(LST==false) return false;
//        boolean RST = isBalanced(root.right);
//        if(RST==false) return false;
//        return true;
        //instead of all this u can write just one line
        return isBalanced1(root.left) && isBalanced1(root.right);
    }

//    In the levels code we are already visiting all the nodes and having their levels so instead of traversing again
//    we can find the difference in levels for each root and store it in the method of levels.

    //Optimal

    public int levels(Node root, boolean[] ans) {
        if (root == null) return 0;
        int leftLevels = levels(root.left, ans);
        int rightLevels = levels(root.right, ans);
        int diff = Math.abs(leftLevels - rightLevels);
        if (diff > 1) ans[0] = false;
        return 1 + Math.max(leftLevels, rightLevels);
    }

    public boolean isBalanced(Node root) {
        boolean[] ans = {true};
        levels(root, ans);
        return ans[0];
    }
}
