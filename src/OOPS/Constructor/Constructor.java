package OOPS.Constructor;

class Student {
    //instance variable
    String name;
    String address;
    int age;
    public int marks;
    public String grade;

    //Constructor -> same name as the class , no return type.
    Student(String name,String address,int age,int marks,String grade){
        System.out.println("Called During Object Creation");
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    //Normal method
    public void display(){
        System.out.println("Name is :: "+name);
        System.out.println("Address is :: "+address);
        System.out.println("Age is :: "+age);
        System.out.println("Marks is :: "+marks);
        System.out.println("Grade is :: "+grade);
    }
}

class Employee {
    String name;
    int age;

    // Usage of zero argument constructor
    Employee(){
        System.out.println("Employee Constructor Called");
    }
    // If you have not passed any value for the variables then they will get the default value associated with the datatype of the variable.
    // here name will be null and age will be 0.
    public void disp(){
        System.out.println("Name is :: "+name);
        System.out.println("Age is :: "+age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student = new Student("sartik","Agra",20,90,"A+");
        student.display();

        Employee emp = new Employee();

        emp.disp();
    }
}
