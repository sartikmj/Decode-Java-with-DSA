package Advance_Java.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);

        try{
            num = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Enter a number");
        }
        finally{
            sc.close(); // closing resources.
        }

        // we also use try and finally block without catch block
//        -> in case we want to do something and if any mishappening happend at least the resource is closed.

        Scanner scc = new Scanner(System.in);
        int num2 = 0;
        try{
            num2 = scc.nextInt();
        }
        finally{
            scc.close(); // Even if the error comes the resource will be closed.
            System.out.println("Resource Closed");
        }

        //Try with Resources -> no need to use finally block the resources will close by itself automatically
        // irrespective error comes or not.
        try(Scanner input = new Scanner(System.in)){
            int n =  input.nextInt();
        }
    }
}
