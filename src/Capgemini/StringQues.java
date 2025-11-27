package Capgemini;

public class StringQues {

    public static String replaceConsonantsWithNearestVowel(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                result.append(ch);
            } else {
                char nearest = getNearestVowel(ch, vowels);
                result.append(nearest);
            }
        }

        return result.toString();
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private static char getNearestVowel(char c, char[] vowels) {
        char nearest = 'a';
        int minDist = Integer.MAX_VALUE;

        for (char v : vowels) {
            int dist = Math.abs(c - v);
            if (dist < minDist || (dist == minDist && v < nearest)) {
                minDist = dist;
                nearest = v;
            }
        }
        return nearest;
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = replaceConsonantsWithNearestVowel(input);
        System.out.println(output);  // Output: ieiio
    }

}
