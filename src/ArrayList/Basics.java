package ArrayList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        //declaration
// Syntax: ArrayList<name of Class of Datatype> name = new ArrayList<>(length or size);
        ArrayList<Integer> arr = new ArrayList<>();

//        arr[0] = 1; //it will give error
// you can not set or access elements in Arraylist like Arrays

        // setting values in Arraylist
        // arr.add(index,element); method is used

//        arr.add(1); // it will add the element at the min empty index

        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

//        System.out.println(arr[1]); // it will show error

        //Accessing elements one by one ArrayList => arr.get(index) method is used
        System.out.println(arr.get(0));

        //Accessing all the elements of ArrayList
        for(int i =0;i<=5;i++){
//            System.out.println(arr[i]); // it will show error
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        //You can also access all the elements of ArrayList by just using the name

        System.out.println(arr);

        // In ArrayList there is no default value of elements , like in the default value is 0
        // if any index left empty or none element is set then accessing or printing the ArrayList or that element will give an error

        System.out.println();

        // arr.set(index,element) , is used to modify the arraylist
        arr.set(2,300);

        System.out.println(arr);

        //Method to get size of ArrayList
        // arr.size()
        System.out.println(arr.size());

        // Adding element for more than the size of the Arraylist
        arr.add(99); //this is called pushback
        System.out.println(arr);
        System.out.println(arr.size());

        //removing element
        // arr.remove(index) -> element at the index will be removed
        arr.remove(2);
        System.out.println(arr+" "+arr.size());

        //it can also remove the in between elements , other elements will shift to take its place
    }
}
