package DynamicProgramming.LongestCommonSubsequence;

import java.util.Arrays;

public class LongestCommonSubsequence {

    //for algo you may have to watch the video again but thats fine it won't take long he taught really well

//    //Recursion -> We are sending substrings in Recursion which will give Memory Limit Exceeded error
//    public int longestCommonSubsequence1(String a, String b) {
//        int m = a.length(), n = b.length();
//        if(m==0 || n==0) return 0;
//        String a2 = a.substring(0,m-1); //does not include m-1 index
//        String b2 = b.substring(0,n-1); //does not include n-1 index
//
//        if(a.charAt(m-1)==b.charAt(n-1)){
//            return 1 + longestCommonSubsequence(a2,b2);
//        }
//        else{
//            return Math.max(longestCommonSubsequence(a,b2), longestCommonSubsequence(a2,b));
//        }
//    }
//
//
//
//    //Recursion -> instead of sending substrings we are sending last index of the current substring.
//    // Still we are wasting a lot of memory bcz strings are immutable, so we can usr StringBuilder.
//    public int lcs(int i, int j, String a, String b) {
//        if (i<0 || j<0)
//            return 0;
//
//        if (a.charAt(i) == b.charAt(j)) {
//            return 1 + lcs(i-1, j-1, a, b);
//        } else {
//            return Math.max(lcs(i, j-1, a, b), lcs(i-1, j, a, b));
//        }
//    }
//
//    public int longestCommonSubsequence2(String a, String b) {
//        int m = a.length(), n = b.length();
//        //sending the last character index of both strings in the method.
//        return lcs(m-1,n-1,a,b);
//    }

//    ------------ MAIN CODE START FROM HERE-------------------------------

    //Recursion
    //We are using StringBuilder to save memory and time -> You can also use Character array of the strings instead of StringBuilder
    public int lcs2(int i, int j, StringBuilder a, StringBuilder b) {
        if (i<0 || j<0)
            return 0;

        if (a.charAt(i) == b.charAt(j)) {
            return 1 + lcs2(i-1, j-1, a, b);
        } else {
            return Math.max(lcs2(i, j-1, a, b), lcs2(i-1, j, a, b));
        }
    }

    public int longestCommonSubsequence3(String text1, String text2) {
        //sending the last character index of both strings in the method.
        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);
        int m = a.length(), n = b.length();
        return lcs2(m-1,n-1,a,b);
    }


    //Memoization
    // TC=O(m*n) AS=O(m*n)

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

    //Tabulation -> After watching Memoization

    //A lot of base cases
    //dp[i][j] will store the LCS of substring of 'a' from 0 to i  and substring of 'b' from 0 to j.
    public int longestCommonSubsequenceTabu2(String a, String b) {
        int m = a.length();
        int n = b.length();

        int[][] dp = new int[m][n]; // i = m-1 to 0 | j = n-1 to 0
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int p = i>=1 && j>=1 ? dp[i-1][j-1] : 0;
                int q = j>=1 ? dp[i][j-1] : 0;
                int r = i>=1 ? dp[i-1][j] : 0;
                if(a.charAt(i) == b.charAt(j)){
                    dp[i][j] = 1 + p;
                }
                else{
                    dp[i][j] = Math.max(q,r);
                }
            }
        }
        return dp[m-1][n-1]; // it stores the LCS of substring(a,0,m-1) ad substring(b,0,n-1)
    }


    // Tabulation -> after watching Memoization
//    Extra Row and Extra Column in the DP
//    To avoid the Base Case conversion step, you can make dp larger
//    IMPORTANT -> In LCS always make the dp[m+1][n+1] it simplifies base case

    //TC=O(m*n) SC=O(m*n)
    public int longestCommonSubsequenceTabu(String a, String b) {
        int m = a.length();
        int n = b.length();

        int[][] dp = new int[m+1][n+1];
        //fill the base case in the dp, here the base case is zero which is by default filled in it

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                //t[i][j]
                if(a.charAt(i-1)==b.charAt(j-1)){ // be careful here
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        //result
        return dp[m][n]; // dp[m][n] will store LCS of substr(a,0,m-1) and substr(b,0,n-1) ->m-1 and n-1 included
        // dp[i][j] will store LCS of substring of a from 0 to i(included) and substring of b from 0 to j(included)
    }

    //BEST SOLUTION FOR LCS
    //Complete Tabulation -> Made completely on its own + Space Optimization
    // -> it is not a code just a logic check the ss in wp group for that
    //Space Optimization -? we will apply space optimization for this code

    //TC=O(m*n) SC=O(n)
    //from the prev tabulation code just replace i with 1
    public int longestCommonSubsequenceBest(String a, String b) {
        int m = a.length(),n = b.length();
        int[][] dp = new int[2][n+1]; //without space optimization it would be int[m+1][n+1]
        //dp[i][j] will store the LCS of s1 substr 0 to i and s2 substr 0 to j
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1) == b.charAt(j-1))
                    dp[1][j] = 1 + dp[1-1][j-1]; // here it would have been dp[i][j] = 1+dp[i-1][j-1]
                else
                    dp[1][j] = Math.max(dp[1][j-1], dp[0][j]);
            }
            // copy the 1st row to 0th row for next time (Specifically for Space Optimization )
            for(int j=0;j<=n;j++)
                dp[0][j] = dp[1][j];
        }
        return dp[1][n];
    }

}


