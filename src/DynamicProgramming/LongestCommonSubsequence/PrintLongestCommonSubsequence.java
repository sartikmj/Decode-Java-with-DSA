package DynamicProgramming.LongestCommonSubsequence;

//leetcode
public class PrintLongestCommonSubsequence {

    //Step1: Using Tabulation find the length of the LCS
    //Step2: put pointer at the last index of the 2D array i.e. DP
    //Step3: Check if the character at charAt(i-1) and charAt(j-1) NOTE: remember the dp array is of size m+1,n+1 so i th index of array is representing i-1 th character of string
    // if they are not same
    // check the Max of(i-1,j-1) and move to the cell i-1,j-1 , that prev diagonal cell
    // If the character at the index i , j then add it to the ans.
    //and move to the max value index
    //keep doing it till reach the 0th col or 0th row
    //now reverse the ans and we got our Longest Common Subsequence

    //We are actually traversing the same path through which we found the length

    public static int LCS(String a, String b){
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        String str = "";
        int i = m,j=n;
        while(i>0 && j>0){ // OR i!=0 && j!=0
            if(a.charAt(i-1) == b.charAt(j-1)){
                str += a.charAt(i-1);
                i--; j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]){
                i--;
            }
            else j--;
        }
        //converting to sb so can reverse the string
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        LCS(s1,s2);
    }
}
