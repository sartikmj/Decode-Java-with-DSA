package OOPS.Polymorphism.StaticPolymorphism.MethodOverloading.Cases.Case3;

// Case3: Compiler will always give preference to Child(Any other class) class over Parent(Object) class

class Sample{
    public void methodOne(String name){
        System.out.println("String version...");
    }
    public void methodOne(Object o){
        System.out.println("Object version...");
    }
}

public class ChildOverParent {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.methodOne("Sachin"); //String --> String
        s.methodOne(new Object()); //Object --> Object
        s.methodOne(null); //null ----> String(reference) , Object(reference)
        // To convert null in Type Promotion Compiler will give preference to String over Object , null will convert to String over Object.
    }
}
