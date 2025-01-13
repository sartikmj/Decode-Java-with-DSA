package Strings.StringBuilder;

public class Initialisation {
    public static void main(String[] args) {
        //Initialising String
        String s = new String("Sartik");

        //Initialising StringBuilder
        StringBuilder sb = new StringBuilder("Sartik");

        //It uses all the inbuilt methods of String

        System.out.println(sb);

        //Creating an empty StringBuilder
        StringBuilder sbe = new StringBuilder("");
        StringBuilder sbe2 = new StringBuilder(); //both works

        System.out.println(sbe.length());


        StringBuilder sb1 = new StringBuilder(10); //10 is the initial capacity of StringBuilder
        //length will still be 0 until a character is inserted in it
        //length is the used capacity

        StringBuilder sb2 = new StringBuilder(s); //u can also give string variable here

        System.out.println(sb1.capacity()); //returns the capacity of the StringBuilder

        //Capacity of an empty StringBuilder is 16

        System.out.println(sb2.capacity()); // 16 + length of the StringBuilder , if u have not set the capacity
    }
}
