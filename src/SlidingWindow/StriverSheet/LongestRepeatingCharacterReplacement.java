package SlidingWindow.StriverSheet;

import java.util.HashMap;

//leetcode 424
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        // we should keep the ele with highest freq and change the rest

        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            map.put(c, map.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(c));

            while ((j - i + 1) - maxFreq > k) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);

        }
        return maxLen;
    }
}
