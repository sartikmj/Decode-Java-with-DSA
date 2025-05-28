package Trees.BinaryTree.Traversals.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

//    first we will as root to the queue, then we will poll it, everytime we poll a node from queue we will add its children to
//    the queue.

    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            Node front = q.poll();
            System.out.print(front.val + " ");
            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
    }

    //BFS Right to Left
    public static void bfsRightToLeft(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            Node front = q.poll();
            System.out.print(front.val + " ");
            if (front.right != null) q.add(front.right);
            if (front.left != null) q.add(front.left);
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

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        g.right = h;

        bfs(a); // a-> root
        System.out.println();
        bfsRightToLeft(a);
    }
}
