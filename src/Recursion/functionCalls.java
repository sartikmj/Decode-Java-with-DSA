package Recursion;

public class functionCalls {

    public static void mango(){
        System.out.println("Hi i am mango");
    }

    public static void banana(){
        mango();
        System.out.println("Hi i am banana");
    }

    public static void apple(){
        banana();
        System.out.println("Hi i am apple");
        mango();
    }

    public static void main(String[] args) {
        System.out.println("Hi, i am main");
        apple();
    }
}
