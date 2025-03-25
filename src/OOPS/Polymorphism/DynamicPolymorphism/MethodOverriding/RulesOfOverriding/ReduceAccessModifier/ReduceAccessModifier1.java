package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding.RulesOfOverriding.ReduceAccessModifier;

class Parent3{
    void methodOne(){ //this is called default access modifier
        System.out.println("Hello from Parent Class......");
    }
}

class Child3 extends Parent3{
    protected void methodOne(){ //will not give error the scope is increased from default to protected
        System.out.println("Hello from Child Class......");
    }
}

public class ReduceAccessModifier1 {

}
