package Strings.StriverSheet;

// Leetcode 14
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        //edge cases
        if(strs.length == 0) return "";

        //Vertical Scanning
        for (int i = 0; i < strs[0].length(); i++) { //for traversing first string in array
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) { //for traversing each letter of all the other string in array.
                if(i>=strs[j].length() || c!=strs[j].charAt(i)){ //if the length of 1st string is more than that of jth.
                    return strs[0].substring(0,i); //taking out the matched part
                }
            }
        }
        return strs[0]; //All characters matched
    }
}
