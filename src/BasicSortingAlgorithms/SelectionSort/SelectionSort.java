package BasicSortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for(int i=0;i<n-1;i++){ //selection sort takes n-1 passes to sort the array
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i;j<n;j++){
                //finding min element and its index
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            //swapping min with first element
            int temp = arr[mindx];
            arr[mindx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
