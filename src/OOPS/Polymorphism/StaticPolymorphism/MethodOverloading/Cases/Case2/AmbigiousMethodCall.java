package OOPS.Polymorphism.StaticPolymorphism.MethodOverloading.Cases.Case2;

//Case2: Ambigous Method Call CompileTime Error

class Calculator2{
    public void add(int a, float b){
        System.out.println("int-float argument");
    }
    public void add(float a, int b){
        System.out.println("float-int argument");
    }
}

public class AmbigiousMethodCall {
    public static void main(String[] args) {
        Calculator2 c = new Calculator2();
        c.add(10,2.5f); //int,float
        c.add(2.5f,10); //float,int
//        c.add(10,2); //CompileTime Error : Ambigous Method Call
    }
}
