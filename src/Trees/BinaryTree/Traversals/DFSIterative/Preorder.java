package Trees.BinaryTree.Traversals.DFSIterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Trees.BinaryTree.Traversals.Node;


public class Preorder {

//    In Recursive method, a stack is used to store the recursive methods, named Call Stack.
//    So, in our Iterative DFS we can use Stack for our traversal.

//    DFS Preorder is: Root Left Right

//    Approach
//    First push Root in the Stack,
//    we will put a while loop till stack is empty.
//    pop the stack, and store or print the value of the node.
//    And insert it's left and right child in the Stack.
//    NOTE:- Insert Right child first then the Left child. Bcz in Stack is LIFO.

//    TC=O(n), nodes are only once pushed and popped out of the stack
//    SC=O(n), size of arraylist used to store ans.
//    Auxiliary Space = O(h), where h is the height/level of the Tree.
//    Best Case Auxiliary space = O(1), if the tree is Degenerate.

//    Worst time complexity is for Balanced Tree = O(logn),  avg case = O(logn) , best case

    public List<Integer> preorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        if(root!=null) st.push(root); //push root to the stack
        while(!st.isEmpty()){
            Node top = st.pop();
            ans.add(top.val); //store node value in the arraylist
            if(top.right != null) st.push(top.right); //push right child
            if(top.left != null) st.push(top.left); //push left child
        }
        return ans;
    }


}
