package Strings.Questions;

import java.util.Scanner;

public class totalNumberOfDigits {
    // Return the total number of digits in a number without using any loop.
    //Hint: Try using inbuilt Integer.toString() function.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        String s = Integer.toString(n); // This method i used to convert the Integer into String

//        String s = n +""; // or you can also use this to first convert the Integer into string.
        int l = s.length();
        System.out.println("number of digits in this number are: "+l);

        boolean t = true;

        //You ca
        String m = Boolean.toString(t);
    }
}
