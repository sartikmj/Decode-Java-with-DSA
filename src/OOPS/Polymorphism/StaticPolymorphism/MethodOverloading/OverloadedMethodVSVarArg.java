package OOPS.Polymorphism.StaticPolymorphism.MethodOverloading;

// Compiler will give preference to exact match method over Var-arg method

class Demo{
    //Exact Match : One-Argument
    public void methodOne(int i){
        System.out.println("General Method");
    }

    public void methodOne(int... arg){
        System.out.println("Var-arg Method");
    }
}

public class OverloadedMethodVSVarArg {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.methodOne(); //Var-arg Method
        d.methodOne(10); // General Method, Compiler will give preference to exact match method
        d.methodOne(10,20);//Var-arg Method
    }
}
