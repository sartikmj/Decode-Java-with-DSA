package Strings;

import java.util.Arrays;

public class Sorting {
    //Sorting string Dictionary order
    public static void main(String[] args){
        String s = "sartik";
        char[] ch = s.toCharArray(); //to convert string to character Array

        Arrays.sort(ch); // to sort character array
        for(char ele : ch){
            System.out.print(ele);
        }

        StringBuilder sb = new StringBuilder("sharma");

        char[] sh = sb.toString().toCharArray(); //convert sb into string and then into character array
        Arrays.sort(sh);

        System.out.println();

        for(char ele : sh){
            System.out.print(ele);
        }

    }
}
