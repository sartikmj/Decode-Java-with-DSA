package DynamicProgramming.DPOnTrees;

//leetcode 124
public class BinaryTreeMaximumPathSum {

    //Step1: for every node we will find tha path with maximum sum that passes through it.
    // line sum ko maximise krna hai , pure LST ya RST ka sum nahi nikalna LST or RST m se ek path ka sum nikalna hai
    // usme se sabse maximum wala ans hoga

    //pathSum = root.val + lineSum(root.left) + lineSum(root.right) //sum of path that is passing from that root
    // lineSum mean sum from root to leaf node
    // maxSum = Math.max(pathSum,maxSum);

    //the code will have problem bcz it is leaf to leaf but there are negative values also
    // if the lineSum of a node is negative we will not add it in to our pathSum

    static int maxSum;
    public int lineSum(Node root){
        if(root==null) return 0;
        int leftLineSum = lineSum(root.left);
        int rightLineSum = lineSum(root.right);
        int pathSum = root.val; //extra
        // if the lineSum of a node is negative we will not add it in to our pathSum
        if(leftLineSum>0) pathSum += leftLineSum; //extra
        if(rightLineSum>0) pathSum += rightLineSum; //extra
        maxSum = Math.max(maxSum,pathSum); //extra
        return root.val + Math.max(0, Math.max(leftLineSum, rightLineSum)); //considering 0 here bcz if both left Line sum and right line sum are negative we do not add any of them to our sum
    }
    public int maxPathSum(Node root) {
        maxSum = Integer.MIN_VALUE; //bcz enpty paths are not allowed and a single root tree with negative root value exists
        lineSum(root);
        return maxSum;
    }
}
