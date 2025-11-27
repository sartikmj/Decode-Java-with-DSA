package Trees.BinaryTree.Implementation;

class Node{
    public int val;
    Node left; //By default null value
    Node right;

    Node(int val){
        this.val = val;
    }
}

public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1); //a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        a.left.right.val = 90; //e.val = 90;

//        System.out.println(e.val);
//        System.out.println(a.left.right.val);

        Node g = new Node(10);
        Node h = new Node(20);
        c.left = g;
        e.right = h;

        print(a);
    }

    public static void print(Node root){ //root is like a temp variable in LL
        if(root==null) return; //base case
        System.out.print(root.val+" ");
        print(root.left); //left subtree
        print(root.right); //right subtree
    }
}
