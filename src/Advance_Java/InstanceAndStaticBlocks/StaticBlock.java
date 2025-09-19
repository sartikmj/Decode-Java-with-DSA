package Advance_Java.InstanceAndStaticBlocks;



public class StaticBlock {

    static{ //static block
        System.out.println("Static Block Executed");
    }

    { //Instance Block
        System.out.println("Instance Block Executed");
    }

    StaticBlock(){ //Constructor
        System.out.println("Constructor Executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Executed");

        StaticBlock obj = new StaticBlock();
    }
}
