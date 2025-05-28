package Trees.BinaryTree.Traversals.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
//    Leetcode 144


//    Here we use a global arraylist to store the ans, but it is not preferred to do it in Interviews
    static List<Integer> ans;
    public void preorder(Node root) { // Root Left Right
        if (root == null) return;
        ans.add(root.val); //root
        preorder(root.left); //left
        preorder(root.right); //right
    }

    public List<Integer> preorderTraversal(Node root) {
        ans = new ArrayList<>(); // re-initializing
        preorder(root);
        return ans;
    }

//    It's better to send the variables, here the arraylist to store the ans as parameter in the method.
//    preferred in interviews
    public static void preorder(Node root,List<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }

    public List<Integer> preorderTraversal2(Node root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
}
