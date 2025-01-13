package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int x = sc.nextInt();

        //solution

        boolean found = false;

        for( int i=0 ; i<n ; i++ ){
            if(arr[i] == x){
                found = true;
                System.out.println("Element found at index: "+i);
                //for optimisation
                break;
            }
        }
        if(found){
        }
        else{
            System.out.println("Element not found");
        }
    }
}
