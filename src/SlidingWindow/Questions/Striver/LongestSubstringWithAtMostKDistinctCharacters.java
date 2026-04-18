package SlidingWindow.Questions.Striver;

import java.util.*;

public class LongestSubstringWithAtMostKDistinctCharacters {


    //Brute Force
    // TC=O(N2)
    public static int BruteForce(int k, String str) {
        // Write your code here
        int maxLen = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < n; j++) {
                map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);

                if (map.size() <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else break;
            }
        }
        return maxLen;
    }

    //    Better
    // TC=O(2N)
    public static int Better(int k, String str) {
        // Write your code here
        int maxLen = 0;
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;

        while (r < n) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            if (map.size() <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            } else {
                while (map.size() > k) {
                    map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                    if (map.get(str.charAt(l)) == 0) {
                        map.remove(str.charAt(l));
                    }
                    l++;
                }
            }
            r++;
        }
        return maxLen;
    }

    // Optimized
    // TC=O(N)
    public static int kDistinctChars(int k, String str) {
        // Write your code here
        int maxLen = 0;
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;

        while (r < n) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            if (map.size() <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            } else {
                if(map.size() > k) {
                    map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                    if (map.get(str.charAt(l)) == 0) {
                        map.remove(str.charAt(l));
                    }
                    l++;
                }
            }
            r++;
        }
        return maxLen;
    }


    public static void main(String[] args) {

    }
}
