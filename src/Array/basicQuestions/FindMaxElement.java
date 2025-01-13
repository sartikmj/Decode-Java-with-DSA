package Array.basicQuestions;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args){
        //find the max element from the array
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }

        //solution 1
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] >max){
                max = arr[i];
            }
        }
        System.out.println("The max element is "+max);

        //solution 2
        int mx = Integer.MIN_VALUE; //assign mx the value which is smaller than all the values inside the array
        //this method can give problem if the value assigned is larger than the largest element of the array
        //so always assign Integer.MIN_VALUE
        for(int i=0;i<n;i++){
            //if(arr[i] >mx) mx = arr[i];
            //we can also do it this way
            mx = Math.max(mx,arr[i]); // between mx and arr[i] the one which is greater store it in mx
        }
        System.out.println("The max element is "+mx);


    }
}
