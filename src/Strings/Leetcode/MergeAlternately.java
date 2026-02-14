package Strings.Leetcode;

public class MergeAlternately {
//  Leetcode 1768
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        StringBuilder s = new StringBuilder();
        int i=0,j=0;
        while(i<w1.length && j<w2.length){
            s.append(w1[i]);
            i++;
            s.append(w2[j]);
            j++;
        }
        while(j<w2.length){
            s.append(w2[j]);
            j++;
        }
        while(i<w1.length){
            s.append(w1[i]);
            i++;
        }
        String string = s.toString();
        return string;
    }
}
