package HashmapsAndHashsets.HashMap.Questions;

import java.util.HashMap;

//Leetcode 242
public class Anagram {

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        //make map of character and it's frequency
        HashMap<Character,Integer> smap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            if(smap.containsKey(key)){
                int freq = smap.get(key);
                smap.put(key,freq+1);
            }
            else smap.put(key,1);
        }

        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char key = t.charAt(i);
            if(tmap.containsKey(key)){
                int freq = tmap.get(key);
                tmap.put(key,freq+1);
            }
            else tmap.put(key,1);
        }

        //traverse on map and compare the freq of each character in both the maps
        for(char key : smap.keySet()){
            int val1 = smap.get(key);
            if(!tmap.containsKey(key)) return false; //if tmap does not contain val1 from smap, return false.
            int val2 = tmap.get(key);
            if(val1!=val2) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
