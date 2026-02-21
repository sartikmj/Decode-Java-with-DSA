package Strings.Leetcode;

public class LongestCommonSubsequence {
//    Leetcode 1143

    //    Brute Force
    public int LCS(String s1, String s2, int i, int j) {
        //Base CASE
        if (i >= s1.length() || j >= s2.length()) return 0;

        if (s1.charAt(i) == s2.charAt(j)) {
            return 1 + LCS(s1, s2, i + 1, j + 1);
        } else {
            return Math.max(LCS(s1, s2, i + 1, j), LCS(s1, s2, i, j + 1));
        }
    }

    //Memoization , Better Approach

    public int LCS(String s1, String s2, int i, int j, int[][] memo) {
        //Base CASE
        if (i >= s1.length() || j >= s2.length())
            return 0;

        //agar memo m ans hai to return from here
        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            memo[i][j] = 1 + LCS(s1, s2, i + 1, j + 1, memo);
            return memo[i][j];
        } else {
            memo[i][j] = Math.max(LCS(s1, s2, i + 1, j, memo), LCS(s1, s2, i, j + 1, memo));
            return memo[i][j];
        }
    }

    public int longestCommonSubsequence1(String s1, String s2) {
        int[][] memo = new int[s1.length()][s2.length()];
        //initialising all memo values with -1
        for(int i=0;i<memo.length;i++){
            for(int j=0;j<memo[0].length;j++){
                memo[i][j] = -1;
            }
        }
        //OR
        // for (int[] row : memo) {
        //     Arrays.fill(row, -1);
        // }
        return LCS(s1,s2,0,0,memo);
    }

//    Tabulation

//    t[i][j] = LCS between s1 of length i and s2 of length j.

//    Make two tables of length s1.length + 1 and s2.length + 1.
//    final ans will be t[m][n],
//    t[0][0], for zero in either row or col , will output ans 0, bcz there can be nothing in common with a string of length 0.
//    i and j will be initialised with s1.length-1 and s2.length-1

    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];

        //row 0 k bamde sare 0 honge
        //col 0 k bamde sare 0 honge
        //by default 0 hi hai

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                //t[i][j]
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        //result
        return dp[m][n];
    }

}
