package Strings.Questions;

import java.util.Scanner;

public class maxOccurrence {
    //Given a String consisting of lower case english alphabets . Print the character that is occurring most number of times
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26]; //to store freq of alphabet
        //0-a 1-b 2-c....25-y 26-z
        for(int i=0; i<s.length(); i++){ //setting freq of characters
            char ch = s.charAt(i);
            int idx = (int)ch -97;
            freq[idx]++;
            // OR freq[(int)s.charAt(i) - 97]++;
        }
        int maxFreq = 0;
        for(int i=0;i<freq.length;i++){ //to find the max freq
            maxFreq = Math.max(maxFreq,freq[i]);
        }

        for(int i=0; i<freq.length; i++){ //to find how many characters have maxFreq
            if(freq[i] == maxFreq){
                char ch = (char)(i + 97); // getting character of the index with max freq
                System.out.print(ch+" ");
            }
        }
    }
}
