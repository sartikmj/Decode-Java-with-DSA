package Strings.BasicQuestions;
import java.util.Scanner;
public class countVowel {
    //Input a string and count all the vowels in the given string.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isVowel = false;
        int count = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
           if(isVowel(ch)) count++;
        }
        System.out.println(count);
    }

    public static boolean isVowel(char c){
        if(c == 'a' || c == 'A') return true;
        if(c == 'e' || c == 'E') return true;
        if(c == 'i' || c == 'I') return true;
        if(c == 'o' || c == 'O') return true;
        if(c == 'u' || c == 'U') return true;
        return false;
    }
}
