package BasicSortingAlgorithms.InsertionSort;

import BasicSortingAlgorithms.BubbleSort.BubbleSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10,-4,20,78,-6,8};
        int n = arr.length;
        BubbleSort.print(arr);

        //Insertion Sort
        for(int i=1;i<n;i++){ //n-1 passes
            for(int j=i;j>=1;j--){ //moving to left
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break; //if left element is smaller than the element it means it is already sorted no need to swap further
            }
        }
        BubbleSort.print(arr);


        //Another way to write Bubble Sort

        for(int i =1;i<n;i++){
            int j=i;
            while(j>=1 && arr[j]<arr[j-1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }


}
