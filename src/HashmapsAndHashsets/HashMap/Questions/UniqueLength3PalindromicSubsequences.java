package HashmapsAndHashsets.HashMap.Questions;

import java.util.*;

public class UniqueLength3PalindromicSubsequences {

    //we will make two hashmaps named first and last that stores the character and its index.
    //in the first map we will store the character with their indexes and if the character appears again we will not update it
    //in the first map we will store the character with their indexes and if the character appears again we will update it in the map
    //so first map will show the first index of the character and last map will show the last index of the character.
    //now for a character check both maps if the character has first nd last index same or diff, if same it is not part of palindrome
    //if first and last index are not same then in the string traverse from the first index to last index
    //take a variable count and between first and last index count the number of unique characters.
    //we will make a hashset and store all the characters between first and last index so only store character once and then check the
    //size of hashset , it will give us the count of distinct characters between the indexes. and add that size in count.
    //After traversing complete map in array you will get the final count which is our answer.

    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> firstMap = new HashMap<>();
        HashMap<Character,Integer> lastMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!firstMap.containsKey(ch)) firstMap.put(ch,i); //only put once
            lastMap.put(ch,i); //update every time
        }
        int count = 0; //to store total the palindromic sequences
        for(char ch : firstMap.keySet()){
            int firstIdx = firstMap.get(ch);
            int lastIdx = lastMap.get(ch);

            HashSet<Character> set = new HashSet<>(); //to store the unique characters between first and last idx.
            for(int i=firstIdx+1;i<=lastIdx-1;i++){ //between first and last index exclusive
                set.add(s.charAt(i));
            }
            count+=set.size();
        }
        return count;
    }
}
