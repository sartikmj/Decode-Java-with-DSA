package TCS;

import java.util.HashMap;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Store frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Step 2: First non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                System.out.println("First Non-Repeating: " + ch);
                break;
            }
        }

        // Step 3: Find maximum frequency
        int max = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
            }
        }

        // Step 4: Print first character having max frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == max) {
                System.out.println("Most Repeating: " + ch);
                break;
            }
        }
    }
}