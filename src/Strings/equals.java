package Strings;

public class equals {
    public static void main(String[] args) {
        String s1 = "abcxyz";
        String s2 = "abcxyz";
        System.out.println(s1 == s2); //it will return true , bcz of Interning

        String s3 = "abc";
        String s4 = "xyz";

        String s5 = s3 + s4;

        System.out.println( s1 == s5); //it will return false , bcz of different addresses of same String

        String s6 = new String (s1); // or String("abcxyz");

        System.out.println(s1 == s6); // it will return false ,  bcz new keyword allocates new memory address

        //equals compare string character by character

        System.out.println(s1.equals(s6)); //returns true
        System.out.println(s1.equals(s5)); //returns true

        //can also use .compareTo() functions returns 0 if strings are same
        System.out.println(s1.compareTo(s6));

        String s7 = "pqr";

        System.out.println(s1.compareTo(s7));
    }
}
