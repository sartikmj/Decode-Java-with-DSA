package Trees.BinaryTree.BasicQuestions;

class Node{
    public int val;
    Node left; //By default null value
    Node right;

    Node(int val){
        this.val = val;
    }
}

public class SumOfNodes {

    public static int sum(Node root){
        if(root==null) return 0; //bcz null does not have any value, so it's sum is 0
        return root.val + sum(root.left) + sum(root.right); // root.val + sum of LST + sum of RST
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

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        c.left = g;
        e.right = h;

//        sum(a,0);
        System.out.println(sum(a));
    }
}
