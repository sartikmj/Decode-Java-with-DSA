package Trees.BinaryTree.Traversals;
import java.util.ArrayList;
import java.util.List;

public class Inorder {
    //Leetcode 94

//    You can also do this with declaring arraylist as global variable ans re-initializing it.
//    instead of passing it as a parameter in the method.

    public void inorder(Node root,List<Integer> ans){
        if(root == null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
}
