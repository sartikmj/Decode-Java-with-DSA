package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

public class removeOccurence {
    //Remove all occurrence of 'a' from a string
    public static void remove(int i, String s, String ans) {
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if (s.charAt(i) != 'a') ans += s.charAt(i);
        remove(i + 1, s, ans);
    }
//  T.C = O(n)
    public static void remove2(int i, String s, String ans) {
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='a') remove2(i+1,s,ans+s.charAt(i));
        else remove2(i+1,s,ans);
    }

    public static void main(String[] args) {
        String s = "Sartik Sharma";
        remove(0, s,"");
        remove2(0, s,"");

    }
}
