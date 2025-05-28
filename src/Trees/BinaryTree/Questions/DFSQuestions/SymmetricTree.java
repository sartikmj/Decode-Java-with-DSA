package Trees.BinaryTree.Questions.DFSQuestions;

public class SymmetricTree {
    public void invert(Node root){
        if(root==null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }

    public boolean same(Node p, Node q){
        //base cases
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        if(p.val!=q.val) return false;
        if(same(p.left,q.left)==false) return false;
        if(same(p.right,q.right)==false) return false;

        return true;
    }

    public boolean isSymmetric(Node root) {
        if(root==null) return true;
        invert(root.right);
        return(same(root.left,root.right));
    }
}
