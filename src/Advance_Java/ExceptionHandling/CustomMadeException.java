package Advance_Java.ExceptionHandling;

class MyException extends Exception {

    MyException() {

    }

    //Constructor, to take message
    MyException(String message) {
        // to assign your message to the Exception Object you have to pass the message to the Exception Class
        super(message); //passing the message to parent class i.e, Exception Class
    }

}

public class CustomMadeException {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 5;
        try{
            if(num2<0){
                throw new MyException("Negative Number"); //Custom Made Exception
            }
            else{
                int result = num1/num2;
                System.out.println(result);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
