package HashmapsAndHashsets.HashMap.Questions;

import java.util.HashMap;

//Leetcode 3
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // 2 Pointer Approach, i and j sliding window from i to j
        int n = s.length();
        if (n <= 1)
            return n;
        int maxLen = 0;
        int i = 0, j = 0;
        HashMap<Character, Integer> map = new HashMap<>(); //character , its index
        while (j < n) {
            char ch = s.charAt(j);
            if (map.containsKey(ch) && map.get(ch) >= i) { //if is in the map and also inside the window
                int len = j-i;
                maxLen = Math.max(maxLen,len);
                //i ko lekr jao character ki position se ek aage
                while (s.charAt(i) != ch)
                    i++;
                i++; //ek aaage nikalna hai

            }
            map.put(ch, j); //if exist or not exist in map add or update inside the map
            j++;
        }
        //there can be a case when j is outside the loop and now we have the longest substring
        int len = j-i;
        maxLen = Math.max(maxLen,len);
        return maxLen;
    }
}
