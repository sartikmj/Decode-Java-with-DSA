package Array;

public class PassingArraysToMethods {

    public static void main(String[] args) {
        //In case of variables
        //variables of all datatypes are passed by value in methods
        //in case of variable
        int x = 5;
        System.out.println(x);
        change(x); // x is passed by value inside the method, so the x in the main method and the x in the change method are different
        //hence the value of x in the main method will not be changed
        System.out.println(x);

        //In case of Array

        //Array are passed by reference in methods
        int[] arr = {10, 20, 30}; //this arr is also a reference variable
        System.out.println(arr[0]);
        changeArr(arr); //here the array in actual will change
        System.out.println(arr[0]);
    }

    public static void change(int x) {
        x = 10; //this x is the one inside the change method it will update this x but will not change the x in main method
    }

    //    public static void changeArr(int[] arr){
//        arr[0] = 90; //it will change the value in actual array
//    }
    //Even if we change the name of the parameter it still works same , it will change the value inside the actual array which is passed in the method
    public static void changeArr(int[] x) {
        x[0] = 90; //it will change the value in actual array
    //x is a reference variable of array that has been given as a parameter in method , the array is same it just have been given
        //a new name x which is also called reference variable

        //We can say that the address of the array is passed in method as argument but
        //more technically the reference variable is passed
        //In C and C++ address of array is passed for sure but not in java
        //In JAVA Reference variable of the Array gets passed
    }


}
