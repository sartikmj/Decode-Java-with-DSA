package Strings.StriverSheet;

public class ReverseWords {

    // Better Approach
    public String reverseWords1(String s) {
        // Trim leading/trailing spaces and split into words (handles multiple spaces)
        String[] words = s.trim().split("\\s+"); // "\\s+" matches one or more whitespace chars

        //Reverse the Array Words
        int left=0,right=words.length-1;
        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        //Join the words with a single space
        return String.join(" ",words);
    }

    //Optimized using StringBuilder
    public String reverseWords(String s) {
        // Trim leading/trailing spaces and split into words (handles multiple spaces)
        String[] words = s.trim().split("\\s+"); // "\\s+" matches one or more whitespace chars
        StringBuilder sb = new StringBuilder();

        // Append the words in reverse order
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i>0) sb.append(" "); //Add space except after last word
        }
        return sb.toString();
    }
}
