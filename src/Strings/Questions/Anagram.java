package Strings.Questions;
import java.util.Arrays;
public class Anagram {
    //Valid Anagram Leetcode 242
    //Anagram is actually jumble words

    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        char[] ah = a.toCharArray();
        char[] bh = b.toCharArray();
        Arrays.sort(ah);
        Arrays.sort(bh);
        a = new String(ah); //used to convert the char array into String
        b= new String(bh);

        return a.equals(b);
    }
    public static void main(String[] args) {
        //Approach
        //sort the strings , then those strings will be exactly same
        // then check them by equals() , if they are equal hence they are anagram other not

        System.out.println(isAnagram("abcd","dcaab"));

    }

}
