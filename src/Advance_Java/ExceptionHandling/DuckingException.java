package Advance_Java.ExceptionHandling;

// Handling vs Ducking

class Demo {
    public void a() throws Exception {
        System.out.println("in a");
        int val = 9;

        b();
        //Ducking
    }

    public void b() throws Exception { //you can duck and handle it somewhere else without this,
        //but it is preferred to written throws Exception as it is a warning to the method calling this method
        // that it may throw exception.
        int num1 = 9;
        int num2 = 0;

        int result = num1 / num2;
        System.out.println(result);
        //Ducking

    }

}

public class DuckingException {
    public static void main(String[] args){
        Demo obj = new Demo();
        try{
            obj.a();
        }
        catch(Exception e){
            e.printStackTrace(); //better for debugging shows exactly where the error is coming from.
        }
    }
}
