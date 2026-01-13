package Trees.BinaryTree.Traversals.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Postorder {
//    Leetcode 145

    public void postorder(Node root, List<Integer> ans){
        if(root == null) return;
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root,ans);
        return ans;
    }
}
