package BasicSortingAlgorithms.BubbleSort;

public class BubbleSort {
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
        for (int x = 1; x < n ; x++) { // n-1 passes needed max to sort any array
            for (int i = 0; i < n - 1; i++) {
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
