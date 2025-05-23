package OOPS.Abstraction.AbstractClass.ConcreteMethodInAbstractClass;

//Inside abstract class, we can write concrete methods also.

//Why we need constructor in abstract class, when we can't instantiate an object?
//Ans. To get the properties of parent class to child class, we need constructors in
//abstract class also.

abstract class Person{
    String name;
    int age;
    float height;

    Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

class Student extends Person{
    int marks;
    float avg;
    Student(String name, int age, float height, int marks, float avg){
        //to call the parameterised constructor of parent class to the child class
        super(name,age,height);

        this.marks = marks;
        this.avg = avg;
    }
    public void display(){
        System.out.println("Name is :: name");
        System.out.println("Age is :: age");
        System.out.println("Height is :: height");
        System.out.println("Marks is :: marks");
        System.out.println("Avg is :: avg");
    }
}

public class ConstructorInAbstractClass {
    public static void main(String[] args) {
        Student student = new Student("John Smith", 20, 5, 5, 5);
        student.display();
    }
}


//Super keyword
//->In Java, the super keyword is used to refer to the immediate parent class of the current class.
//
//
//        1. Access Parent Class Variables
//If the child class has a field (variable) with the same name as a field in the parent class, the super keyword can be used to differentiate between them.
//
//        2. Call Parent Class Methods
//You can use super to call a method of the parent class that has been overridden in the child class.
//
//        3. Call Parent Class Constructor
//The super() keyword can be used to call the constructor of the parent class. This is particularly useful when the parent class constructor requires arguments.
//
//Key Points to Remember:
//The super() call must always be the first statement in a constructor.
//If the parent class has a parameterized constructor, you must explicitly call it using super(arguments) in the child class.
//If no super() is specified, Java implicitly calls the no-argument constructor of the parent class.