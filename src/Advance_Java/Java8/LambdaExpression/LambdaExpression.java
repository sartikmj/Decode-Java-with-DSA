package Advance_Java.Java8.LambdaExpression;

public class LambdaExpression {
    //To provide implementation of Functional Interface
    //Less coding

    @FunctionalInterface
    interface Car{
        void drive(int avg);
    }

    @FunctionalInterface
    interface Plane{
        void fly(int avg, int speed);
    }

    public static void main(String[] args) {
        // Lambda Expression does not make a new Anonymous class all the code is inside the method itself.

        //Only work for Functional Interface
        Car obj = avg -> System.out.println("Driving..."+avg);  //if it is single argument the () are optional
        obj.drive(10);

        Plane obj2 = (avg, speed) -> { //mentioning datatype of arg is optional,
            //if implementation has more than one line use {}
            System.out.println("Flying..."+avg+" "+speed);
        };

//        If you want to return something there is the exactly same syntax the last value which is a single value will return.
//        A obj = (i,j) -> i+j; //if A method is expecting a return, i+j will be returned.
        obj2.fly(10,20);
    }
}
