package DynamicProgramming.DPOnTrees;

//leetcode 96
public class UniqueBinarySearchTrees {

// it is ques of 1D dp, in dp we will store the ways of arranging the n nodes , then we will calculate the total arrangements
    // by adding all of them, for each tree, we will multiply the ways to arrange the LST and RST ways

//    It is called Catalan Number Series

    //TC=O(N^2), AS=O(N)
    public int numTrees(int n) {
        if(n<=1) return n;
        int[] dp = new int[n+1];
        dp[0] = 1; //if there is 0 node it can be arranged only one way
        dp[1] = 1;  //if there is 1 node it can be arranged only in one way
        dp[2] = 2; //if there are two nodes it can only be arranged in two ways

        for(int i=3;i<=n;i++){ //number of nodes
            for(int j=1;j<=i;j++){ // selecting the root node
                dp[i] += dp[j-1]*dp[i-j]; //based on the root node distributing node in LST and RST, and calculating their ways
//                       LST * RST
            }
        }
        return dp[n];
    }
}
