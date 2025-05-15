package OOPS.Abstraction.Interface;


interface ICalculator {
    //public abstract
    void add(int a, int b);
    void subtract(int a, int b);
    void multiply(int a, int b);
    void divide(int a, int b);
}

//class not implementing all methods of interface must be declared abstract
abstract class CalculatorImpl implements ICalculator{

}

//class implementing Interface must implement all the methods of the Interface
class Calculator implements ICalculator{
    public void add(int a, int b) {
        System.out.println("The sum is:: "+(a+b));
    }
    public void subtract(int a, int b) {
        System.out.println("The difference is:: "+(a-b));
    }
    public void multiply(int a, int b) {
        System.out.println("The multiplication is:: "+(a*b));
    }
    public void divide(int a, int b) {
        System.out.println("The division is:: "+(a/b));
    }
}

public class Interface {
    public static void main(String[] args) {
        //loose coupling : Polymorphism
        ICalculator calculator = new Calculator();
      //made a runtime object of the class and storing it in the reference of the Interface , parent interface of the class

        //using the object to call the methods
        calculator.add(1,2);
        calculator.subtract(2,3);
        calculator.multiply(3,4);
        calculator.divide(4,5);
    }

}
