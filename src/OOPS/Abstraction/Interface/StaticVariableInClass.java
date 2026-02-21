package OOPS.Abstraction.Interface;

interface IDemo{
    //public static final
    int x = 10;
}

public class StaticVariableInClass implements IDemo{
    public static void main(String[] args) {
        int x = 100; //local variable
        System.out.println(x); //100
        System.out.println(IDemo.x); //10 , can access x with interface name
        System.out.println(StaticVariableInClass.x); //10 , can also access with the class name as it implements that interface.
    }
}
