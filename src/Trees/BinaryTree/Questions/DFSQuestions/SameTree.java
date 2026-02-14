package Trees.BinaryTree.Questions.DFSQuestions;

public class SameTree {

//    TC=O(n)
    public boolean isSameTree(Node p, Node q) {
        //base cases
        if(p==null && q==null) return true;
        //you can combine below 2 as
        //if(p==null || q==null) return false;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;

        if(p.val!=q.val) return false;
        if(isSameTree(p.left,q.left)==false) return false;
        if(isSameTree(p.right,q.right)==false) return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
