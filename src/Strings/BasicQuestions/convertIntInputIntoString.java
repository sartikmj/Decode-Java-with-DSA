package Strings.BasicQuestions;

import java.util.Scanner;

public class convertIntInputIntoString {
    //Take integer input and convert it into a String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        //converting int a into String
        String s = "" + a;
        System.out.println(s);
         //by this method you can not actually change the datatype of the variable
        // but store it in another variable as a String.
    }
}
