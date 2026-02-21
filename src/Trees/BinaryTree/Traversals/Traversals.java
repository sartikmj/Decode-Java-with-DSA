package Trees.BinaryTree.Traversals;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {

    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" "); // root
        preorder(root.left); // left
        preorder(root.right); // right
    }

    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            Node front = q.poll();
            System.out.print(front.val + " ");
            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1); //a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;
        c.right = g;
        g.right = h;

        System.out.print("Preorder: ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(a);
        System.out.println();
        System.out.print("LevelOrder: ");
        levelOrder(a);
        System.out.println();
    }
}
