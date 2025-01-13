package Strings.Basics;

public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        s = s.concat("xyz");
        //in concat you can only concat two strings not an Integer with a String it will give an error
        s = s + "pqr"; //adds or concatenate "pqr" at the end of s.
        String p = "lmn";
        s = s + p;  //concatenate
        // concat method can only concatenate a string with the string
        // + operator can concatenate a String with an Integer

        String a = "Sartik";
        a = a + 12; //concatenate a number
        System.out.println(a);
        a = a + 'q'; //concatenate a character
        System.out.println(a);

        //to concatenate in front of string just put the string / integer / character before the + operator

        a = 99 + a;
        System.out.println(a);

        //question 1
        System.out.println("abc"+10+20);
    }
}
