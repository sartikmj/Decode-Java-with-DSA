package Trees.BinaryTree.Questions.BFSQuestions;

import java.util.Scanner;

public class BFSUsingDFS {

    //Watch Module 30 video 3, to get the code where u pass n as parameter instead of declaring global variable

    static int n; //global
    public static void printNthLevel(Node root, int level){ // n is the level
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        //to print reverse bfs just interchange below two statements.
        printNthLevel(root.left, level+1);
        printNthLevel(root.right, level+1);
    }

    public static void bfs(Node root){
        for(int x=0; x<levels(root); x++){
            n=x;
            printNthLevel(root, 0);
            System.out.println();
        }
    }

    public static int levels(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
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
        Scanner sc = new Scanner(System.in);

        bfs(a);
    }
}
