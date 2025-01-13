package Array.Questions;

public class reverseArray {
    // Write a program to reverse the array without using any extra array.
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};

        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        // let i and j be the two indexes to swap
        // i+j = n-1
        // j = n-1-i
        // swap(arr[i] , arr[j])


        // reverse
        // loop will run till arr.length/2 , to reverse array
        for(int i=0;i<arr.length/2;i++){
            int j = arr.length-1-i;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
