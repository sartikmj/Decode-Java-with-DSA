package DynamicProgramming.OneDimensionalDP;

import java.util.Arrays;

public class FriendsPairing {

//    You are given a number 'n' Denoting that there are 'n' friends
//    Find out the number of ways in which a person can either pair up or stay single.

//    For n > 2, consider the nth friend:
//    Stays single
//    Then we just solve for the remaining (n-1) friends.
//    Contribution: countFriendsPairings(n-1)
//    Pairs with one of the other (n-1) friends
//    Choose 1 friend out of (n-1) → (n-1) ways.
//    Then solve for remaining (n-2) friends.
//    Contribution: (n-1) * countFriendsPairings(n-2)

//    EXPLANATION :
//    PROBLEM IDEA :
//You have n friends.
//    Each friend can either:
//
//    Stay single, or
//
//    Pair up with any one of the other (n-1) friends.
//
//    We need to count all possible ways.
//
//🧩 Recursive logic
//
//    Let’s focus on the nth friend:
//
//    Case 1 → nth friend stays single
//
//    Then the remaining (n-1) friends can form pairs in countFriendsPairings(n-1) ways.
//
//            Case 2 → nth friend pairs with one of the (n-1) others
//
//    There are (n-1) ways to choose that friend.
//
//    After that, you’re left with (n-2) friends, which can pair in countFriendsPairings(n-2) ways.
//👉 So total = (n-1) * countFriendsPairings(n-2).
//
//🧠 Combine both
//
//    Total ways =
//            countFriendsPairings(n-1) (when nth is single)
//            + (n-1) * countFriendsPairings(n-2) (when nth is paired)


    //Recursion
    public long countFriendsPairings(int n) {
        // code here
        if(n<=2) return n;
        return countFriendsPairings(n-1) + (n-1)*countFriendsPairings(n-2);
        //       stays single                   Pairs with n-1th friend

    }

    //Memoization
    // TC=O(N) SC=O(N)
    public static int pairs(int n,int[] dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];

        return dp[n] = pairs(n-1,dp) + (n-1)*pairs(n-2,dp);
    }

    public long countFriendsPairingsMemo(int n) {
        // code here
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return pairs(n,dp);

    }


    //Tabulation
    //TC=O(n) SC=O(n)
    public long countFriendsPairingsTabu(int n) {
        // code here
        int[] dp = new int[n+1];
        if(n>0) dp[1] = 1;
        if(n>1) dp[2] = 2;

        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {

    }
}
