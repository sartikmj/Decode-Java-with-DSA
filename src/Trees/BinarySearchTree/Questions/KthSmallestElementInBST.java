package Trees.BinarySearchTree.Questions;

import java.util.*;

//Leetcode 230
public class KthSmallestElementInBST {

    //Brute
    public void helper(Node root, int k, ArrayList<Integer> ans){
        if(root==null) return;
        helper(root.left,k,ans);
        ans.add(root.val);
        helper(root.right,k,ans);
    }
    public int kthSmallestBrute(Node root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,k,ans);
        return ans.get(k-1);
    }

    //Optimal
    private int count = 0;
    private int result = -1;

    private void inorder(Node node,int k) {
        if (node == null) return;

        inorder(node.left,k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        inorder(node.right,k);
    }

    public int kthSmallest(Node root, int k) {
        inorder(root,k);
        return result;
    }
}
