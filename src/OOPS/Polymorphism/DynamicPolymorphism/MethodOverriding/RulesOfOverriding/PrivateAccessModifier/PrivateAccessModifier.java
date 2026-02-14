package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding.RulesOfOverriding.PrivateAccessModifier;

//3. Private access modifier won't participate in inheritance, so overriding them in child class is not possible

class Parent{
    private void methodOne(){
        System.out.println("Hi Parent");
    }
}

class Child extends Parent{
    public void methodTwo(){
        System.out.println("Hi Child");
    }
}

public class PrivateAccessModifier {
    public static void main(String[] args) {
        Parent p = new Child();
//        p.methodOne();
        // Error : CE: methodOne() has private access modifier in parent
    }
}
