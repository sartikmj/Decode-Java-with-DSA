package BasicSortingAlgorithms.BubbleSort;

public class OptimizedBubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        check after every pass if array has been sorted , if it is break the loop
        int[] arr = {3, 1, 2, 5, 4};
        int n = arr.length;
        print(arr);
        for (int x = 0; x < n - 1; x++) { // Same thing
            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) { // inner looop will run till n-1-x times
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true) break;
//            //check if this pass is sorted or not
//            boolean flag = true;              // This code can be written inside upper loops
//            for(int i=0;i<n-1;i++){
//                if(arr[i]>arr[i+1]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag==true) break;
//        }
            print(arr);
        }
    }
}
