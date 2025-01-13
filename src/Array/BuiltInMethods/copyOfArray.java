package Array.BuiltInMethods;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args) {
        //Copy the elements of the array into another array

        int[] arr = {30,10,40,23,89,34};

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

//        int[] nums = arr; // Shallow Copy
//        // nums is a shallow copy means ,  nums is not a new array inside the memory it's just another name given to the array arr.
//        // hence changes made to nums will also occur in arr , bcz they both are the same array.
//        nums[0] = 70; // store 70 at index 0 in array nums
//        System.out.println(arr[0]); //it should give 30 as in arr 0th index element is 30 , but it gives 70 , bcz nums is a shallow copy
//
//        for(int ele : nums){
//            System.out.print(ele+" ");
//        }
//        System.out.println();

        // To copy the elements of an array into another array the concept of Deep Copy is used
        // Deep copy can be done in two ways

        //built-in method to copy elements of an array into another array => Arrays.copyOf(arr,arr.length)
        int[] brr = Arrays.copyOf(arr,arr.length); // Deep Copy
      //syntax: int[] brr = Arrays.copyOf(original array , new length of this new array)

      // Deep Copy means really a new array is made inside the memory that has the elements copied from the other array
        brr[0] = 690;
        for(int ele : brr){
            System.out.print(ele+" ");
        }
        System.out.println();

        System.out.println(arr[0]); // no change

        // Another way of creating Deep Copy

        int[] crr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            crr[i] = arr[i];
        }
    }
}
