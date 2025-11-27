package Trees.BinaryTree.Questions.BFSQuestions;

import java.util.*;

//Leetcode 102

public class BFSUsingDFSLeetcode {
    //to get the number of levels in the tree
    public int levels(Node root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
    //to store the Nth level of tree
    public void nThLevel(Node root, int level, int lvl, List<Integer> arr){ //level-> current level, lvl-> the level I want to print(store) right now
        if(root==null) return;
        if(level>lvl) return; //for optimisation
        if(level==lvl) arr.add(root.val);
        nThLevel(root.left,level+1,lvl,arr);
        nThLevel(root.right,level+1,lvl,arr);
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root); //total number of levels in the tree
        for(int i=0;i<lvl;i++){
            List<Integer> arr = new ArrayList<>();
            nThLevel(root,0,i,arr);
            ans.add(arr);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
