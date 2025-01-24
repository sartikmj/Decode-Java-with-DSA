package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding.RulesOfOverriding.ReturnType;

//In case of Overriding , we can't change the return type of the method.

class Parent{
    public Object methodOne(){
        return null;
    }
}

class Child extends Parent{
//    public void methodOne(){
//        System.out.println("Hello from Child method");
//    }
}

public class CEReturnType {
    public static void main(String[] args) {
        Parent p = new Child();

        p.methodOne(); //generate error , CE
        //Void and Object are not related.
    }
}
