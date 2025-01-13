package Strings.StringBuilder;

import java.util.Scanner;

public class TakingStringBuilderAsInput {
    public static void main(String[] args){
        //Taking SB as Input
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s); //take string as input and put inside SB

        StringBuilder sb1 = new StringBuilder(sc.nextLine()); //this also work same way , actual way of taking SB as input
    }
}
