package Trees.BinaryTree.Questions;

import java.util.*;

public class BTLeftSideView {

    public int levels(Node root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public void DFS(Node root,int level,ArrayList<Integer> ans){
        if(root==null) return;
        ans.set(level,root.val);
        DFS(root.right,level+1,ans);
        DFS(root.left,level+1,ans);
    }
    ArrayList<Integer> leftView(Node root) {
        // code here
        int n = levels(root);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        DFS(root,0,ans);
        return ans;
    }
}
