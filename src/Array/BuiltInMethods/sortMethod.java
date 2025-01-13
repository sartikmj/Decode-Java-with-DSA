package Array.BuiltInMethods;

import java.util.Arrays;

public class sortMethod {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

//        built-in method to sort an array
        Arrays.sort(arr);
        System.out.println();

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
