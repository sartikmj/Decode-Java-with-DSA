package DynamicProgramming.LongestCommonSubsequence;

public class ShortestCommonSupersequence {

    //if u just want to find out the length of the Shortest Common Supersequence the logic is
    // s1 + s2 - LCS(s1,s2).  Just like finding the Union of two sets in Venn Diagram
    //

    //Code to find the length of the SCS
    public static int lengthOfSCS(String s1, String s2){
        int scs = s1.length() + s2.length() - lcs(s1,s2);
        return scs;
    }

    public static int lcs(String a, String b){
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }


    //Now tp get the actual SCS
    // Step 1: store the LCS of both strings
    // Step 2: take two variable i which will traverse on s1 and j which will traverse on s2
    // Step 3: Take another variable k that will traverse on LCS
    // Step 4: till then ele at i or ele at j are not equal to ele at k keep adding them in the ans
    // agar i ele k ele k equal hai to hold it keep moving on j and adding the ele to ans
    // Step 5: when ele at i is same as ele j and both are same as ele at k, then add that ele in the ans
    // and move all the three pointers further
    // Step 6: if LCS pointer reaches the end directly add other strings left elements to the ans
    // Step 7: Now add the leftover elements of a and b into the ans (scs)

    public static void main(String[] args) {
        System.out.println(lengthOfSCS("abac","cab"));
    }
}
