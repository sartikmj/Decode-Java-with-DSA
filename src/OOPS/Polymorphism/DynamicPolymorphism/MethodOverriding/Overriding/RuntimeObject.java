package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding;

class Parent{
    public void property(){
        System.out.println("land+cash+gold");
    }

    public void marry(){
        System.out.println("RelativeGirl");
    }
}

class Child extends Parent{
    // Overriding
    @Override
    public void marry(){
        //Changing Implementation
        System.out.println("Some Other Girl");
    }
}

public class RuntimeObject {
    public static void main(String[] args) {

        //Parent Object
        Parent p = new Parent();
        p.property();
        p.marry();

        //Child Object
        Child c = new Child();
        c.marry();

        //Child Object ---> bcz In case of Overriding JVM will bind the method calls based on the runtime object but not the reference type.
        Parent cp = new Child();
//      Reference       Runtime
//        Type          Object

        cp.marry();
    }
}
