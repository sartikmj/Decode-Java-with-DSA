package HeapsAndPriorityQueue.Questions;


class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class CheckIfBTisMaxHeap {

//    You have to check two properties
//    1. Heap Order Property -> for MaxHeap every node is larger than its children.
//    2. Tree must be a Complete Binary Tree.

//    To check for MinHeap
//    1. Heap Order Property -> for MaxHeap every node is smaller than its children.
//    2. Tree must be a Complete Binary Tree.


//    --------------IMPORTANT--------------
//    How to check if any tree is CBT
//    1. Calculate size i.e, number of nodes
//    2. Put index values on nodes, go on children using the formula lc = 2*i+1, rc = 2i+2
//    3.If index getting assigned are > size-1 , it is not a CBT.
//    -> In CBT the indexes should be up to size-1.

    public boolean isMaxHeap(Node root){
        int n = size(root);
        return (isHeap(root) && isCBT(root,0,n));
    }

    //Heap Order Property
    public static boolean isHeap(Node root){
        if(root==null) return true;
        if(root.left!=null){
            if(root.val<root.left.val) return false;
        }
        if(root.right!=null){
            if(root.val<root.right.val) return false;
        }
        return isHeap(root.left) && isHeap(root.right);
    }

    public int size(Node root){
        if(root==null) return 0;
        return size(root.left) + size(root.right) + 1;
    }

    //Complete Binary Tree
    public boolean isCBT(Node root, int i, Integer n){ //bcz of Integer wrapper class it ab object now and will pass by reference
        if(root==null) return true;
        if(i>=n) return false;
        return isCBT(root.left, 2*i+1, n) && isCBT(root.right, 2*i+2, n);
    }

    public static void main(String[] args) {
        ConvertBSTToMaxHeap obj = new ConvertBSTToMaxHeap();

        Node a = new Node(10);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b;a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println(isHeap(a));
    }

}
