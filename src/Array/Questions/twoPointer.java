package Array.Questions;

public class twoPointer {
    public static void main(String[] args) {
        // Write a program to reverse the array without using any extra array.
        //Using Two Pointer

        int[] arr = {10,20,30,40,50,60,70};
        for(int s : arr){
            System.out.print(s+" ");
        }

        //Pointers
        int i=0;
        int j = arr.length-1;

        // If you want to reverse a particular part of the array , change the i and j to the indexes of starting and ending of the range.
        // int i=1,j=5;
        // indexes between the pointers will be reversed

        //reverse
        while(i<=j){
           swap(arr,i,j);
            i++;
            j--;
        }

        System.out.println();
        for(int k :arr){
            System.out.print(k+" ");
        }
    }

    // NOTE :- inbuilt swap function can be used for swapping array elements bcz its pass by reference , but it can't be used to swap variables bcz in variables it is pass by value.

    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
