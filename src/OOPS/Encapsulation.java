package OOPS;

class Student{
    //Data-Security
    private int rollNo;
    private String name;
    private String address;

    //setter methods
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //getter methods
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}

//Home Work
class Employee{
    private String eid;
    private String ename;
    private int eage;
    private String eaddress;

    //setter methods
    public void setEid(String eid){
        this.eid = eid;
    }
    public void setEname(String ename){
        this.ename = ename;
    }
    public void setEage(int eage){
        this.eage = eage;
    }
    public void setEaddress(String eaddress){
        this.eaddress = eaddress;
    }

    //getter methods
    public String getEid(){
        return eid;
    }
    public String getEname(){
        return ename;
    }
    public int getEage(){
        return eage;
    }
    public String getEaddress(){
        return eaddress;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        //calling setter methods
        s1.setRollNo(58);
        s1.setName("Sartik");
        s1.setAddress("Agra");

        //calling getter methods
        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());

        Employee e1 = new Employee();

        e1.setEid("123456789");
        e1.setEname("Sartik");
        e1.setEage(25);
        e1.setEaddress("Agra");

        System.out.println(e1.getEid());
        System.out.println(e1.getEname());
        System.out.println(e1.getEage());
        System.out.println(e1.getEaddress());

    }
}
