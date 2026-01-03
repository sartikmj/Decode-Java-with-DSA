package Trees.BinarySearchTree.Questions;

import java.util.ArrayList;
import java.util.List;

//Leetcode 98
public class ValidateBST {

    //Brute Force
    public void inorder(Node root, List<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public boolean isSorted(List<Integer> ans){
        for(int i=1;i<ans.size();i++){
            if(ans.get(i)<=ans.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public boolean isValidBSTBrute(Node root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        boolean result = isSorted(ans);
        return result;
    }

    //Optimal
    //best and easy code
    public boolean isValidBST(Node root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBSTHelper(Node root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBSTHelper(root.left, min, root.val) && isValidBSTHelper(root.right, root.val, max);
    }
}
