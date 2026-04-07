package TCS;

import java.util.Arrays;

public class Question3 {

    // longest common prefix

    public String longestCommonPrefix(String[] strs) {

        for(int i=0;i<strs[0].length();i++){

            char ch = strs[0].charAt(i);

            for(int j=1;j<strs.length;j++){

                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        // no mismatch happened
        return strs[0];
    }

    //Another Method
    public String longestCommonPrefix2(String[] strs) {

        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs); //similar arrays comes closer, more different arrays get apart

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

}
