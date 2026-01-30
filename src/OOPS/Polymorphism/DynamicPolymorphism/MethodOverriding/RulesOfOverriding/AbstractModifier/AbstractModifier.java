package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding.RulesOfOverriding.AbstractModifier;

//5. abstract is a non-access modifier applicable at
//a. method -> If we are not giving the body for a method then mark the method
//as "abstract".
//b. class -> If we don't want the object to be created for a class, then mark
//the class as "abstract".
//c. variable-> This access modifier can't be applied on variables.
//In case of overriding, compulsorily the child class should give implementation for
//all the abstract methods present in the parent class, if the implementation is not
//given then that child class should be marked as "abstract".

abstract class Parent{
    abstract public void methodOne();
}

class Child extends Parent{
    public void methodOne(){
        System.out.println("Child");
    }
}

public class AbstractModifier {
    public static void main(String[] args) {
        Parent p = new Child();
        p.methodOne();
    }
}
