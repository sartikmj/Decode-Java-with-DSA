package OOPS.Variables;

class LoanApp{
    //static variable
    static float rateOfInterest = 9.5f;
}

public class StaticVariable {
    public static void main(String[] args){
        System.out.println( LoanApp.rateOfInterest);
    }
}
