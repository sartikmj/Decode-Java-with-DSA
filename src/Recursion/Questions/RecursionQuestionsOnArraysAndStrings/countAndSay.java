package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

public class countAndSay {
//    Leetcode 38
    public static String countAndSay(int n) {
        if(n==1) return "1"; //base case
        String s = countAndSay(n-1);
        // now we have to modify s
        String ans = "";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len = j-i;
                ans += len;
                ans += s.charAt(i);
                i=j;
            }
        }
        //loop break before last element processed so doing it again once here
        int len = j-i;
        ans += len;
        ans += s.charAt(i);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
