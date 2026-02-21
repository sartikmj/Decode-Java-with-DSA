package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding.RulesOfOverriding.FinalModifier;

//4. final is a non-access modifier applicable at
//a. variable => If applied at variable level, then the value can't be changed.
//b. method => If applied at method level, then we can't override the method
//in child class.
//c. class => If applied at class level, then the class won't participate in
//inheritance.
//final methods can't be overriden in child class


class Parent{
    public final void methodOne(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    // Generate error because final methods can not be overriden.
//    public void methodOne(){
//        System.out.println("Child");
//    }
}

public class FInalModifier {
    public static void main(String[] args) {
        Parent p = new Child();
        p.methodOne();
    }
}
