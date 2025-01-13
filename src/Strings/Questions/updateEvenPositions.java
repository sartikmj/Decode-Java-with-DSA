package Strings.Questions;

import java.util.Scanner;

public class updateEvenPositions {
    //Input a string and update all the even positions in the string to character 'a'. Consider 0-based indexing.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = ""; //empty string declaration and definition
//        String t; //wrong way
//        t += "ewe" //it will show error

        for(int i=0;i<s.length();i++){

            if(i%2 == 0){
                str += 'a';
            }
            else{
                str += s.charAt(i);
            }
        }
        s = str; // now s is pointing at the new string str
        System.out.println(s);
    }
}
