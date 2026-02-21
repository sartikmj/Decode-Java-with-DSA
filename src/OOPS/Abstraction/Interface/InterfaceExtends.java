package OOPS.Abstraction.Interface;

interface ICalculator4{
    //public abstract
    void add(int a,int b);
    void sub(int a,int b);
}
//Interface can extend any number of Interfaces
interface IAdvancedCalculator extends ICalculator4{
    //public abstract
    void mul(int a,int b);
    void div(int a,int b);
}
class CalculatorImpl2 implements IAdvancedCalculator
{

    //ICalculator
    public void add(int a,int b){
        System.out.println("The sum is :: "+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("The diff is :: "+(a-b));
    }
    public void mul(int a,int b){
        System.out.println("The mul is :: "+(a*b));
    }
    public void div(int a,int b){
        System.out.println("The div is :: "+(a/b));
    }
}

public class InterfaceExtends {
    public static void main(String[] args) {

        //the reference is made of the implemented interface(child interface) by class and Runtime object will be made of class itself.

        //loose coupling : Polymorphism
        IAdvancedCalculator calculator = new CalculatorImpl2();
        calculator.add(10,20);
        calculator.sub(100,20);
        calculator.mul(10,20);
        calculator.div(100,20);
    }
}
