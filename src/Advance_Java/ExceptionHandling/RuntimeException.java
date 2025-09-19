package Advance_Java.ExceptionHandling;

public class RuntimeException {

    public static void main(String[] args) {

        int num1 = 6; //-- normal statement
        int num2 = 2; //-- critical statement
        int res = 0;
        int[] values = {4,7,2,9};
        String name = null;

        //handling critical statement we put it in a block
        try //try the code if it runs or throws an error, if runs fine np if an error occurs it will throw a Specific
        // Exception object and go to catch block.
        {
            res = num1/num2;
            System.out.println(values[2]); //critical as it is possible to fetch at index larger than the size.
            System.out.println(name.length());
//            System.out.println("In try block");
        }
        catch ( ArithmeticException e ){ //in parentheses, we have to accept the Exception object thrown by the code in try block
            //what to do when error occurs
            System.err.println("You can not divide the number by zero.");
        }
        catch ( ArrayIndexOutOfBoundsException e ){
            System.err.println("Stay in the limit of Array.");
        }
        catch( Exception e ){ // In case an Exception occur you don't know about, so for handling it as a general Exception.
            System.err.println("Something went wrong.");
        }

        System.out.println(res);
        System.out.println("Bye");
    }
}
