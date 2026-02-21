package Trees.BinaryTree.Traversals.DFSIterative;

import java.util.*;

import Trees.BinaryTree.Traversals.Node;

public class Postorder {

//    Postorder is Reverse of reverse Preorder. (IMPORTANT)
//    Reverse(Reverse Preorder) == Postorder

//    in order to get reverse preorder we will push left child fist into the stack
//    then reverse the ans you get and you will get the Postorder with iteration.

//    TC=O(n), SC=O(n), Auxiliary space = O(n)
    public List<Integer> postorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            Node top = st.pop();
            ans.add(top.val);
            if(top.left!=null) st.push(top.left); //to get reverse preorder, first push left child then right.
            if(top.right!=null) st.push(top.right);
        }
        Collections.reverse(ans); //reverse of reversed preorder == postorder
        return ans;
    }

    public static void main(String[] args) {

    }
}
