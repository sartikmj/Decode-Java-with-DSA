package Advance_Java.Java8.InterfaceInJava8;

interface A {

    void show();

    //From and After Java 8 now you can define methods in Interface with certain conditions ( default and static keyword )
    default void config(){ // now every class that implements this interface do not have to implement this method, they can use it directly
        System.out.println("In Config");
    }

    static void abc(){
        System.out.println("In abc");
    }

//    The difference between the above two methods is that static method does not need an object while the default one does.
}

class B implements A{
    @Override
    public void show() {
        System.out.println("In show");
    }
}

public class Interface {
    public static void main(String[] args) {
        A.abc();

        //the default method needs an object to be called.
        A obj = new B();
        obj.config();
    }
}
