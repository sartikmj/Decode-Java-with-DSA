package Advance_Java.BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter a number: ");

//        int num = System.in.read(); // gets input and returns the ASCII value of the Integer/character that is given as input
//        // it also cases a checked IOException
//        //if a string is given as input it will return the ascii value of the first character of the String
//
//        System.out.println(num - '0');

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());

        System.out.println(num);

        bf.close();
    }
}
