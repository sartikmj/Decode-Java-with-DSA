package Trees.BinaryTree.Questions.DFSQuestions;

public class LowestCommonAncestor {

//    worst: TC=O(N^2) , avg: TC=O(NlogN) , best: TC=O(N)

    public boolean exists(Node root, Node node){
        if(node==root) return true;
        if(root==null) return false;
        return exists(root.left, node) || exists(root.right, node);
        //     exists in LST           OR exists in RST
    }
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p==root || q==root) return root;
        boolean pLiesInLST = exists(root.left,p); //does p lies in left subtree?
        boolean qLiesInLST = exists(root.left,q); //does q lies in left subtree? if not it means it lies in right subtree
        if(pLiesInLST==true && qLiesInLST==true) return lowestCommonAncestor(root.left,p,q); //both lies in LST
        if(pLiesInLST==false && qLiesInLST==false) return lowestCommonAncestor(root.right,p,q); //both lies in RST
        else{ // true && false , false && true
            return root; //-> One lies in LST and other in RST, hence this is our LCA
        }
    }
}
