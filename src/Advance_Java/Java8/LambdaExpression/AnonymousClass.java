package Advance_Java.Java8.LambdaExpression;

interface Car{
    void drive(int avg);
}

//Due to Anonymous class we don't need a class just to implement the interface.
//class WagonR implements Car{
//    @Override
//    public void drive() {
//        System.out.println("Driving..");
//    }
//}

public class AnonymousClass {
    public static void main(String[] args) {

//        Car obj = new WagonR(); //can not instantiate an Interface but can reference it
//        obj.drive();

        Car obj = new Car()
        { //This is called an Anonymous Inner Class.
            //Implementing the Interface -> we have to define all the abstract methods that are inside the interface
            //we can create an object of an anonymous class that implements the interface. That object is technically an instance of the anonymous class, not of the interface itself.
            @Override
            public void drive(int avg) {
                //defining the method in the Interface
                System.out.println("Driving.."+ avg);
            }

        };
        //The drawback is you can only use Anonymous Class once for an Interface implementation.
//        The replacement to Anonymous Class is Lambda Expression.
        obj.drive(16);
    }
}
