package Trees.BinaryTree.Questions.DFSQuestions;

public class InvertBinaryTree {

//    TC=O(n)

    //    Without Helper function
    public static Node invertTree(Node root) {
        if (root == null) return null; //OR return root , bcz root is null.
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    //    with helper function
    public void invert(Node root) {
        if (root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);
    }

    public static Node invertTree1(Node root) {
        invertTree1(root);
        return root;
    }

    public static void main(String[] args) {
        Node a = new Node(1); //a is the root
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        c.left = g;
        e.right = h;


    }
}
