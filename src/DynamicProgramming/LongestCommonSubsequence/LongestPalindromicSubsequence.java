package DynamicProgramming.LongestCommonSubsequence;

import java.util.Arrays;

//Leetcode 516
public class LongestPalindromicSubsequence {

    //Step 1: make another String which is the Reverse of the given String
    //Step 2: find their LCS
    // That's the answer

    //Logic-> because when even if you reverse the string the palindrome inside it will still remain the same
    //bcz it is a palindrome, hence it will be the LCS between both strings, and also the LPS of the given string.

    // LPS(s) = LCS(s,rev(s));

    public int LCS(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        if(a.charAt(i) == b.charAt(j)){
            return dp[i][j] = 1 + LCS(i-1,j-1,a,b,dp);
        }

        else{
            return dp[i][j] = Math.max(LCS(i-1,j,a,b,dp), LCS(i,j-1,a,b,dp));
        }
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder a = new StringBuilder(s);
        StringBuilder b = new StringBuilder(a);
        b.reverse();

        int[][] dp = new int[a.length()][b.length()];

        for(int[] i : dp){
            Arrays.fill(i,-1);
        }

        return LCS(a.length()-1,b.length()-1,a,b,dp);
    }
}
