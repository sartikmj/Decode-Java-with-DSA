package Strings.Basics;

public class builtInStringMethods {
    public static void main(String[] args){
        String s = "Sartik Sharma"; //space is also a character
        String t = "Gauri Tyagi" ;
        System.out.println(s.charAt(4)); //returns element at index 4
        System.out.println(s.length()); // returns the length of the string

        System.out.println(s.indexOf('t'));
        //used to compare two strings lexographically (as per the Dictionary)
        // returns the index of the 1st occurrence of the character given
        //if the character does'nt present in the string it will return -1.

        System.out.println(s.lastIndexOf('a')); //returns the last index of the character in the array

        System.out.println(s.compareTo(t));
        //compare the strings lexographically , each character for same index
        // returns the difference between the ASCII values of the characters of the both string of same index .

        //s.compareTo(t) -> 'S' - 'G'


        //READ NOTES for compareTo() method

        System.out.println(s.contains("rt"));
        System.out.println(s.startsWith("Sa  "));

        String a = "THis iS GooD";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        //these methods makes a new string and do not affect the original string.
        // to convert the original string you can do this

        a = s.toUpperCase();


        // substring(i) and substring(i,j)
        String str = "abcde";
        System.out.println(str.substring(1)); //print all the index from 1 to end
        System.out.println(str.substring(1,4)); // print elements from 1 to 3 , the second index is exclusive.

        // toString()
        // you can use toString to store any variable of any datatype into string
        int i = 123456;
        String o = Integer.toString(i); // This method i used to convert the Integer into String

//        String s = n +""; // or you can also use this to first convert the Integer into string.
        int l = s.length();
        System.out.println("number of digits in this number are: "+l);

        boolean q = true;

        //You ca
        String m = Boolean.toString(q);
    }
}
