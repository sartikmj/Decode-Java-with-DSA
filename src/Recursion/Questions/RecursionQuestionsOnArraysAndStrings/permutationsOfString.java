package Recursion.Questions.RecursionQuestionsOnArraysAndStrings;

public class permutationsOfString {
//    Find all the permutations of a string given all elements of the string are unique

    //for a string of length n, there are n! permutations
//    TC=0(n!)
    public static void printPermutations(String ans , String s){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){ //jitni string ki length hai utni baar call lagegi function ko
            char ch = s.charAt(i); //taking out the character

            String left = s.substring(0,i); // 0 to i-1
            String right = s.substring(i+1); // i+1 to end

            printPermutations(ans+ch,left+right); //update the ans and the string left after taking out the character
        }
    }

    //try doing it if u have to take permutations keeping 2 characters together.

    public static void main(String[] args) {
        String s = "abcd";
        printPermutations("",s);
    }
}
