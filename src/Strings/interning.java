package Strings;

public class interning {
    public static void main(String[] args) {
        // Strings are immutable
        String a = "abcd";
        String b = "abcd";
        //a and b both are pointing at the same string "abcd" in the memory , a new string "abcd" has not created for b.

    }
}
