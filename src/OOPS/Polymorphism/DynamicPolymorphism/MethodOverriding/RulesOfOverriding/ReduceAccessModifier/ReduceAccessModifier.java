package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding.RulesOfOverriding.ReduceAccessModifier;

//2.While Overriding , we can't reduce the scope of the Access Modifier.
// private < default < protected public

class Parent2{
    public void methodOne(){
        System.out.println("Hello from Parent Class....");
    }
}

class Child2 extends Parent2{
//    protected void methodOne(){ //It will generate error bcz we reduced the scope of the access modifier while Overriding
//        System.out.println("Hello from Child Class....");
//    }
}

public class ReduceAccessModifier {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        p.methodOne();
        //Generate error: CE can't reduce the scope of access modifier
    }
}
