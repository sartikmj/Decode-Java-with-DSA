package OOPS.Inheritence;

class Person{ // BaseClass or SuperClass or ParentClass
    public String name;
    public String address;
    public int age;
}

class Student extends Person{ // DerivedClass or ChildClass or SubClass
    public int marks;
    public String grade;

    Student(String name,String address,int age,int marks,String grade){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public void display(){
        System.out.println("Name is :: "+name);
        System.out.println("Address is :: "+address);
        System.out.println("Age is :: "+age);
        System.out.println("Marks is :: "+marks);
        System.out.println("Grade is :: "+grade);
    }
}

public class Inheritance {
    public static void main(String[] srgs){
        Student student = new Student("sartik","Agra",20,90,"A+");
        student.display();
    }
}
