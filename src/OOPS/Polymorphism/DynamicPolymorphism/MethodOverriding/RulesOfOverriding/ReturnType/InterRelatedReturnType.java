package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding.RulesOfOverriding.ReturnType;

class Parent1{
    public Object methodOne(){
        return null;
    }
}

class Child1 extends Parent1{
    public String methodOne(){
        System.out.println("Hello from Child Method");
        return null;
    }
}

public class InterRelatedReturnType {
    public static void main(String[] args) {
    Parent1 p1 = new Child1();

    p1.methodOne();

    }
}
