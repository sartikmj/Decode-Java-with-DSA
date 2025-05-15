package OOPS.Abstraction.Interface;

interface ICalculator3 {
    //public abstract
    void add(int a, int b);
    void sub(int a, int b);
}

class CalculatorAdvanced{
    public void mul(int a, int b){
        System.out.println("the mul is: "+(a*b));
    }
    public void div(int a, int b){
        System.out.println("the div is: "+(a/b));
    }
}

//first-> inheritance
//then-> implementation
class CalcImpl extends CalculatorAdvanced implements ICalculator3{
    public void add(int a, int b){
        System.out.println("the add is: "+(a+b));
    }
    public void sub(int a, int b){
        System.out.println("the sub is: "+(a-b));
    }
}

public class ExtendsAndImplements {
    public static void main(String[] args) {
// -> child class reference and RuntimeObject will be used to make the object.

        //loose coupling : Polymorphism
        CalcImpl calculator = new CalcImpl();
        calculator.add(10, 20);
        calculator.sub(10, 20);
        calculator.mul(2, 3);
        calculator.div(2, 3);
    }
}