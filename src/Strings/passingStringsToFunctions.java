package Strings;

public class passingStringsToFunctions {
    public static void change(String s){
        s="sharma";
    }
    public static void main(String[] args) {
        String s ="Sartik";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}
