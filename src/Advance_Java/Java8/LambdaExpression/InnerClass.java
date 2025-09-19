package Advance_Java.Java8.LambdaExpression;


class A{

    public void show(){
        System.out.println("in A show");
    }

    class B{ //only inner class can be static

        public void display(){
        System.out.println("in B display");
        }
    }
}

class Person{
    int age;
    String name;

    //If you want to store the info separately or in separate variables
    //you can make a subclass
    Address add;

    //you can name all the variables here in this Inner Class
    class Address{ //it will only be used for the Person (the outer class) , not any other place.
        String city;
        int pincode;

    }
}


public class InnerClass {
//    a class inside a class that can only be used inside that Class.

    public static void main(String[] args) {

        A obj = new A();
        //Calling method of A
        obj.show();

//        obj.display(); //can not call method of A with object of A

//        B obj2 = new B(); //it won't work
//        obj2.display();

        //this is how it works
        A.B object = obj.new B();
//       |              |
//  B belongs to A   Need object of A to create object of B bcz B belongs to A and B is non-static class

        object.display(); //now we can call the method of class B.

//        If class B had been static
//        A.B b = new A.B();  // no A object needed, -> B cannot access non-static members of A directly, because it no longer has a hidden reference to an A instance.It can only access static members of A.
//        b.display();

    }

}
