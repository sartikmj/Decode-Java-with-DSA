package Trees.BinaryTree.Traversals.DFSIterative;

import java.util.*;
import Trees.BinaryTree.Traversals.Node;

public class Inorder {

//    Two things are required, Stack and a variable (temp) Node

//TC=O(n), SC=O(n), Auxiliary Space = O(Max Space of Stack)
//    Auxiliary : Best Case -> Balanced Tree Aux=O(log n), Worst Case -> Degenerate Tree Aux = O(n) OR O(h), h: height of BT
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        Node temp = root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp = temp.left;
            }
            else{ //temp==null
                if(st.isEmpty()) break; //means the tree is completely traversed.
                Node top = st.pop();
                ans.add(top.val);
                temp = top.right; //IMP step
            }
        }
        return ans;
    }


}
