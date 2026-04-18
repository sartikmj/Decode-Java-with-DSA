package DynamicProgramming.LongestCommonSubsequence;

//leetcode
public class LongestCommonSubstring {

    //the code is exactly same as the LCS Tabulation code the only difference is in the else
    // instead of dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
    //we will write dp[i][j] = 0;

    //bcz if it is not continuos we will not count it in the ans

    //-----IMPORTANT------------
    //In 2D array each cell represents , us cell k row m jo char h us row wali string ki us character se end hone wali
    // or jo col m char h us col wali string ki us character se end hone wali kitni Maximum Longest Common Substring hai

    //filling the 2D array, if the characters at col and row are same fill i + i-1,j-1
    // if not same fill 0.

    //After filling the array the max value in the 2D array will be the answer.

    public int longestCommonSubstring(String a, String b) {
        int m = a.length();
        int n = b.length();
        int max = 0; //to store the ans
        int[][] dp = new int[m+1][n+1];
        //fill the base case in the dp, here the base case is zero which is by default filled in it

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                //t[i][j]
                if(a.charAt(i-1)==b.charAt(j-1)){ // be careful here
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 0; //if different store 0 bcz substring is continuous, if there is a gap it is not substr
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        //result
        return max;
    }

}
