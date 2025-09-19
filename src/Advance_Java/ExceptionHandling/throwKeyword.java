package Advance_Java.ExceptionHandling;

public class throwKeyword {

    //throw -> actually throw an error manually as the programmer want, used when at a particular condition you want to call
    // catch block.
    // -> it needs an object of exception to throw exception.
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;

        try {
            if (num2 < 0) {
//                Exception e = new ArithmeticException("Negative number"); // you can pass the Message for the exception in the constructor
//                OR
                throw new ArithmeticException();
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number " + e);
        }
    }
}
