package SlidingWindow.StriverSheet;

import java.util.HashSet;

//leetcode 3
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int n = s.length();
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
