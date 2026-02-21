package OOPS.Abstraction.Interface;

interface ICalculator1 {
    //public abstract
    void add(int a,int b);
    void sub(int a,int b);
}

interface IAdvanceCalculator{
    //public abstract
    void mul(int a,int b);
    void div(int a,int b);
}

class CalculatorImpl1 implements ICalculator1,IAdvanceCalculator{
  //ICalculator1
  public void add(int a,int b){
      System.out.println("the sum is::"+(a+b));
  }
  public void sub(int a,int b){
      System.out.println("the sub is::"+(a-b));
  }

  //IAdvanceCalculator
    public void mul(int a,int b){
      System.out.println("the multi is::"+(a*b));
    }
    public void div(int a,int b){
      System.out.println("the div is::"+(a/b));
    }
}

public class MultipleInterfaceImplements {
    public static void main(String[] args) {
        //Making different reference for both the Interfaces
        //to call their separate methods

        //loose coupling : Polymorphism
        ICalculator1 cal = new CalculatorImpl1();

        cal.add(1,2);
        cal.sub(3,4);

        //loose coupling : Polymorphism
        IAdvanceCalculator adv = new CalculatorImpl1();

        adv.mul(5,6);
        adv.div(7,8);
    }
}
