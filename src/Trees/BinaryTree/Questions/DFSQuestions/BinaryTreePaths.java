package Trees.BinaryTree.Questions.DFSQuestions;

import java.util.*;

//Leetcode 257
public class BinaryTreePaths {
//    TC=O(n) SC=O(n*h) h is ht of tree

    //helper function
    public static void path(Node root, String s, List<String> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){//leaf node
            s+=root.val;
            ans.add(s);
            return;
        }
        path(root.left,s+root.val+"->",ans);
        path(root.right,s+root.val+"->",ans);
    }

    public static List<String> binaryTreePaths(Node root){
        List<String> ans = new ArrayList<>();
        path(root,"",ans);
        return ans;
    }
}
