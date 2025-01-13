package BasicSortingAlgorithms.BubbleSort;

public class BubbleSort2 {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4};
        int n = arr.length;
        print(arr);
        for (int x = 0; x < n - 1; x++) { // Same thing
            for (int i = 0; i < n - 1 - x; i++) { // inner looop will run till n-1-x times
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
