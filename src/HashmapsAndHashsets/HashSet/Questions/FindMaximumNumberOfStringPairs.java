package HashmapsAndHashsets.HashSet.Questions;

import java.util.HashSet;

//Leetcode 2744
public class FindMaximumNumberOfStringPairs {

    //first we will traverse the array and check for every string does it's reverse exist in the hashmap, if not we will
    //insert that string into the map.
    //if it is present we will increase the count and remove that string from hashmap too.

    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    //TC=O(n*l) , l is avg length of the array , SC=O(n*l)
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<words.length;i++){
            String rev = reverse(words[i]);
            if(set.contains(rev)){
                count++;
                set.remove(rev);
            }
            else set.add(words[i]);
        }
        return count;
    }
}
