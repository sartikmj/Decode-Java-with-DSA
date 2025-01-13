package Strings.Questions;

import java.util.Scanner;

public class toggleCharacters {
    //Input a String and toggle all the characters of it.
    //(Replace small case with capital case & vice versa)
    public static void main(String[] args){
        //We will use StringBuilder for this question
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());

        //ASCII value of A=65 , Z=90 , a=97 , z=122
        //the difference between ASCII value of small and capital of same alphabet is 32
        //i.e 'a'-'A' = 32
        //we will use this concept to solve this question

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch; //using typecasting

            if(ascii>=65 && ascii<=90){ //capital letter
                ascii+=32;
                ch = (char)ascii; //using typecasting
                sb.setCharAt(i,ch);
            }
            else if(ascii>=97 && ascii<=122){
                ascii-=32;
                ch = (char)ascii;
                sb.setCharAt(i,ch);
            }
        }
        System.out.println(sb);
    }
}
