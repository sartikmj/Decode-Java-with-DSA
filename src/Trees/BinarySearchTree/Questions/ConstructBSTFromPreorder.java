package Trees.BinarySearchTree.Questions;
import java.util.Arrays;

//Leetcode 1008
public class ConstructBSTFromPreorder {

    //method from construct BT from inorder and preorder
    public Node helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi){
        if(prelo>prehi || inlo>inhi) return null;
        Node root = new Node(preorder[prelo]);
        int r = 0;
        while(inorder[r]!=preorder[prelo]) r++;
        int leftsize = r-inlo;
        root.left = helper(preorder,inorder, prelo+1, prelo+leftsize, inlo, r-1);
        root.right = helper(preorder, inorder, prelo+leftsize+1, prehi, r+1, inhi);
        return root;
    }
    public Node bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        int[] inorder = Arrays.copyOf(preorder,n); //now it became Inorder
        Arrays.sort(inorder);
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
}
