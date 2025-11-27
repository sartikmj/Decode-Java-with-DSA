package DynamicProgramming.LongestCommonSubsequence;

//leetcode
public class PalindromicSubstrings {

    //in the 2D array we made every cell stores true if substring from i to j is palindrome(in string) or false if it is not
    //the logic used is if i know string from i to j is palindrome and i-1 and j+1 are same characters then
    // string from i-1 to j+1 is also a palindrome

    //All the diagonal cells will be filled with ones bcz every single element is a palindrome

    //and the lower triangle all are filled with 0, bcz there is not substring from i to j , if i>j
    // like there is no substring from idx 5 to idx 2, we start from lower idx and go to higher one

    // we will fill the 2D array diagonally
    //now we will fill the second diagonal which represent palindromic substring of length 2
    //for that we have to check if the ith and jth element same bcz only then the substring can be palindrome

//    Now for 3rd diagonal first check that if ele at i and j are same or not if they are not same mark 0
    // if they are same, then check if i+1,j-1 th index in array marked 1, if yes then mark i,j as 1, if it is marked 0 mark i,j 0.
    //showing the logic i wrote above

    //keep doing to fill all other upper diagonals

    //Now traverse the 2D array and count the number of ones in it, it will be the ans to total number of palindromic substrings
    // OR keep a count variable and ++ it everytime you fill 1

    //TC:O(n^2) SC= O(n^2)

    public int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int count = 0;
        for(int k=0;k<n;k++){ //loop kitni baar chal raha hai
            int i=0;
            int j = k;
            while(j<n){
                if(i==j){
                    dp[i][j] = 1; //substringstring of length one, 1st diagonal
                    count++;
                }
                else if(j==i+1){ //substring of length 2. 2nd diagonal
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j] = 1;
                        count++;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        if(dp[i+1][j-1]==1){
                            dp[i][j] = 1; // inner substr is palindrome and outer characters are same, hence the complete is a palindrome
                            count++;
                        }
                    }
                }
                i++;j++;
            }
        }
        return count;
    }

}
