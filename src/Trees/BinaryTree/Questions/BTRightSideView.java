package Trees.BinaryTree.Questions;

import java.util.*;

//Leetcode 199
public class BTRightSideView {
    //to do the left view just reverse the dfs, from left then right, to right then left.

//    It will work with all three DFS, Pre In Post Order Traversals.
public int levels(Node root){
    if(root==null) return 0;
    return 1 + Math.max(levels(root.left),levels(root.right));
}

    //out of three DFS any of three will work here.
    public void DFS(Node root, int level, List<Integer> ans){
        if(root==null) return;
        //preorder
        //In DFS at every level, the rightmost element in the tree, will take the place in the specific index in arraylist representing the level.
        //The relative order of the nodes will always be maintained in every DFS so when stored in arraylist the prev value stored at the
        //particular index representing the level will be updated by the right most node value.
        ans.set(level,root.val); //IMPORTANT    //at index == level, insert the value of root
        DFS(root.left,level+1,ans); //going to root.left will increase the level by one
        DFS(root.right,level+1,ans); //going to root.right will increase the level by one
    }

    public List<Integer> rightSideView(Node root) {
        List<Integer> ans = new ArrayList<>();
        int n = levels(root);
        for(int i=0;i<n;i++){
            ans.add(0); //to set the size of an arraylist, equal to the levels of the tree
            //bcz arraylist don't have a size until something inserted in them.
        }
        DFS(root,0,ans);
        return ans;
    }
}
