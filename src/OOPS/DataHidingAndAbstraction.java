package OOPS;


// anything with the access modifier private can only be accessed with in the class and can not be directly accessed outside of the class
class Account{
    //Data Security
    private double balance; //private access modifier , no one can access it directly(outside the class) not allowed , can be accessed indirectly by a method

    //methods :: public
    public double getBalance(double balance){
        //perform authentication
        boolean result = validate("sartik","sartik123");

        //withdrawing the money
        if(result == true){
            this.balance = this.balance - balance;
        }
        else{
            //throw a meaningful message to the user
            System.out.println("Invalid username or password try again");
        }
        return balance;
    }

    //method :: public
    public void setBalance(double balance){
        //perform authentication
        boolean result = validate("sartik","sartik123"); //calling the function validate within the scope od the class

        //depositing the money
        if(result == true){
            //deposit the money
            this.balance = this.balance + balance; // this.balance-> private balance above , balance-> balance put in the method setBalance
            System.out.println("Credited to the account");
        }
        else{
            //throw a meaningful message to the user
            System.out.println("Invalid username or password try again");
        }
    }

    //method :: private
    private boolean validate(String username, String password){
        //logic for authentication
        return username.equalsIgnoreCase("sartik") && password.equals("sartik123");
    }
}

public class DataHidingAndAbstraction {
    public static void main(String[] args){
        Account acc = new Account();
        // balance has private access modifier we can not access it directly outside the class
//        System.out.println(acc.balance);
        acc.setBalance(1000.0);
        double balance = acc.getBalance(500.0);
        System.out.println("Withdrawn :: "+balance+" Amount");
    }
}

