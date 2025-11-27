package DynamicProgramming.LongestCommonSubsequence;

import java.util.Arrays;

//Leetcode 1312
// Same logic for the question Minimum Deletions to make String palindrome.
public class MinimumInsertionStepstoMakeaStringPalindrome {

    //Calculate the Longest Palindromic Sequence Length of the String
    // s.length() - LPS(s).length() = Minimum Insertion to Make String Palindrome

    //Logic -> we found the longest palindromic subsequence now we have to add the counter parts for the letters
    // that are not the part of Palindromic Subsequence, hence the number of counter parts = number of such letters
    // which we can get by s.length() - LPS(s).length();

    class Solution {
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


}
