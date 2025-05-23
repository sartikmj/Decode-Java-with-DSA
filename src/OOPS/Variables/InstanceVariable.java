package OOPS.Variables;

class Student{
    //instance variable
    String name;
    int age;

    //constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //instance method
    public void display(){
        System.out.println("Name is :: "+ name);
        System.out.println("Age is :: "+ age);
    }
}

public class InstanceVariable {
    public static void main(String[] args) {
        Student std1 = new Student("sartik",20);
        std1.display();
        Student std2 = new Student("sachin",21);
        std2.display();
    }
}
