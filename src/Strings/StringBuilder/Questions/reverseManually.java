package Strings.StringBuilder.Questions;

import java.util.Scanner;

public class reverseManually {
    //take SB as input and reverse it without using built in function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());

        int start=0;
        int end=sb.length()-1;
        while(start<end){
            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
        System.out.println(sb);
    }
}
