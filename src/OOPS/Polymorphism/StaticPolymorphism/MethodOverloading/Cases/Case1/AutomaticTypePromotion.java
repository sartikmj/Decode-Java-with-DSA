package OOPS.Polymorphism.StaticPolymorphism.MethodOverloading.Cases.Case1;

//Case 1: Automatic type promotion in Overloading

class Calculator1 {
    public void add(int a) {
        System.out.println("int argument");
    }

    public void add(float a) {
        System.out.println("float argument");
    }

}

public class AutomaticTypePromotion {
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        c.add('a'); //char------->char,int
        c.add(19L); //long------>long,float,double
        //if method for double does not exist and u put double datatype argument it will give error
//        c.add(10.5); //no suitable method found
    }
}
