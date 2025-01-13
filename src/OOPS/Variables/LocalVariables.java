package OOPS.Variables;

class Calculator{
    public void add(int a, int b){
        int result = a+b;
        System.out.println("Sum is: "+result);
    }
}

public class LocalVariables {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
    }
}
