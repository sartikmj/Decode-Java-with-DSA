package Trees.BinaryTree.BasicQuestions;

public class ProductOfNonZeroNodes {

    public static int productNonZero(Node root){
        if(root==null) return 1;
        if(root.val==0) return 1;
        return root.val * productNonZero(root.left) * productNonZero(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(1); //a is the root
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(0);
        Node h = new Node(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        c.left = g;
        e.right = h;

        System.out.println( productNonZero(a));
    }
}
