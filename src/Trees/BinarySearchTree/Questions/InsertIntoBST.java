package Trees.BinarySearchTree.Questions;


//Leetcode 701
public class InsertIntoBST {

    //Normal Approach
    public static Node helper(Node root, int val, Node node){
        if(root == null){
            root = node;
            return node;
        }

        if(val>root.val){
            if(root.right == null){
                root.right = node;
            }
            else helper(root.right,val,node);
        }
        if(val<root.val){
            if(root.left == null){
                root.left = node;
            }
            else helper(root.left,val,node);
        }
        return root;
    }

    public Node insertIntoBST(Node root, int val) {
        Node node = new Node(val);
        return helper(root,val,node);
    }

    //Shorter Approach
    public Node insertIntoBST1(Node root, int val) {
        Node node = new Node(val);
        if(root == null) return new Node(val);
        if(val<root.val) root.left = insertIntoBST(root.left,val);
        else root.right = insertIntoBST(root.right,val);
        return root;
    }

}
