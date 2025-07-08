import java.util.Arrays;

//custom comparator
class Student implements Comparable<Student>{ //inside <> give your class name
    int rno;
    double perc;
    String name;
    Student(int rno, double perc, String name){
        this.rno = rno;
        this.perc = perc;
        this.name = name;
    }

    //make this method-> compareTo
    public int compareTo(Student s){
        return this.rno-s.rno; //means two students are compared on the basis of rno.

        //to compare wrt any other data type you have to typecast it into Integer first
//        return (int)(this.perc - s.perc);

//        NOTE--------------------------
//        to compare on the basis of string do this
//        return this.name.charAt(0)-s.name.charAt(0); //set the character of string on the basis of whom you want to compare////
    }
}

public class CustomComparator {

    public static void print(Student[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i].name + " ");
            System.out.print(arr[i].perc + " " );
            System.out.println(arr[i].rno);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student[]  s = new Student[4];
        s[0] = new Student(76,89,"Sartik");
        s[1] = new Student(88,93,"Kartik");
        s[2] = new Student(99,88,"Himanshu");
        s[3] = new Student(79,73,"Nishant");
        print(s);
        Arrays.sort(s); //give error bcz sort does not know on what basis it should sort, as array contains Object
        print(s);
    }
}
