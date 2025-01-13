package Array.basicQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
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

        int max = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int m2 = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i] > m2 && arr[i] != max){
                m2 = arr[i];
            }
        }
        System.out.println("The second largest element is: "+m2);

    }

    // Another Optimised Way
    // function to find the second largest element
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        // Sort the array in non-decreasing order
        Arrays.sort(arr);

        // start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {

            // return the first element which is not equal to the
            // largest element
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }

        // If no second largest element was found, return -1
        return -1;
    }
}
