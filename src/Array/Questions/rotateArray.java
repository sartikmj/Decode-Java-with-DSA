package Array.Questions;

public class rotateArray {
    // Rotate the given array 'arr' by k steps, where k is non-negative.
    //NOTE:- k can be greater than n as well where n is the size of the array 'arr'

    //Rotate an Array using another Array
    public static int[] rotateArray2(int[] arr, int k) {
        int n = arr.length;

        k = k % n; // to handle cases where k > n

        int[] rotatedArray = new int[n];

        //Copy the last k elements to the start of the rotatedArr
        for (int i = 0; i < k; i++) {
            rotatedArray[i] = arr[n - k + i];
        }

        // Copy the first n-k elements to the remaining positions in the rotatedArray
        for (int i = k; i < n; i++) {
            rotatedArray[i] = arr[i - k];
        }

        return rotatedArray;
    }

    public static void reverseArray(int[] arr, int i, int j) {
        while (i <= j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static int[] rotateArray(int[] arr, int k) {
        // Reverse the elements of array till k index and then reverse the elements after k index , and then reverse the whole array.
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);
        return arr;
    }


    public static void swap(int[] arr, int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int[] brr = {11, 22, 33, 44, 55, 66, 77};
        //k is steps to rotate

        int[] crr = rotateArray2(arr, 2);
        int[] drr = rotateArray(brr, 2);


        for (int l : crr) {
            System.out.print(l + " ");
        }
        System.out.println();

        for (int m : drr) {
            System.out.print(m + " ");
        }
    }
}
