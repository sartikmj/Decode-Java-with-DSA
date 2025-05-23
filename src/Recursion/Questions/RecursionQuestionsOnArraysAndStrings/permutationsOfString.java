package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

public class permutationsOfString {
//    Find all the permutations of a string given all elements of the string are unique

    //for a string of length n, there are n! permutations

    public static void printPermutations(String ans , String s){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            String left = s.substring(0,i);
            String right = s.substring(i+1);

            printPermutations(ans+ch,left+right);
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        printPermutations("",s);
    }
}
