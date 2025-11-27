package DynamicProgramming.LongestCommonSubsequence;

import java.util.Arrays;

//leetcode 583
public class DeleteOperationForTwoStrings {
    public int lcs(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
        if (i<0 || j<0)
            return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] =  1 + lcs(i-1, j-1, a, b, dp);
        } else {
            return dp[i][j] = Math.max(lcs(i, j-1, a, b, dp), lcs(i-1, j, a, b, dp));
        }
    }

    public int longestCommonSubsequence(String text1, String text2) {
        //sending the last character index of both strings in the method.
        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);
        int m = a.length(), n = b.length();

        // i = m-1 to 0, j = n-1 to 0
        int[][] dp = new int[m][n];
        for(int[] ele : dp){
            Arrays.fill(ele,-1);
        }

        return lcs(m-1,n-1,a,b,dp);
    }
    public int minDistance(String word1, String word2) {
        int lcs = longestCommonSubsequence(word1,word2);
        int l1 = word1.length() - lcs;
        int l2 = word2.length() - lcs;

        return l1+l2;

        //OR
//        return word1.length() + word2.length() - 2*longestCommonSubsequence(word1,word2);

    }
}
