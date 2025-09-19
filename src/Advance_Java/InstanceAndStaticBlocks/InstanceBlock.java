package Advance_Java.InstanceAndStaticBlocks;

class A{

    int a,b; //instance varaibles
    A(){
        a=30;b=40; //initialising instance variables

        System.out.println("Constructor Executed "+a+" "+b);
    }

    //Instance Block
    {
        a=10;b=20; //initialising instance variables
        System.out.println("Instance Block Executed "+a+" "+b);
    }
}

public class InstanceBlock {
    public static void main(String[] args) {
        A a=new A();
        //After making the object of the class first the Instance Block will run then the Constructor will run
    }
}
