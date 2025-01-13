package Array;

import java.util.Scanner;

public class basicSyntax {
    public static void main(String[] args) {
        //the index of an element of array is also referred as subscript of element of array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();

        //Declaration aand allocation
//        int[] arr = new int[n];
        int[] arr; //declaration
        arr = new int[n]; //allocation

        //initialisation
        //by indexing
        //initialising individual elements
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;

        //input
        //loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //output
        //loop
        for (int j : arr) {
            System.out.print(j + " ");
        }

        //Another way of initialising

        int[] brr = {10,20,30,40,50,60};

    }



}
