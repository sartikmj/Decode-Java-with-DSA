package Trees.BinaryTree.BasicQuestions;

public class LevelsOfBinaryTree {

    public static int levels(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
//    Height = Level - 1

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

        System.out.println(levels(a));
    }

}
