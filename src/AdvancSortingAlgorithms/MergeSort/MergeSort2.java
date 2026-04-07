package AdvancSortingAlgorithms.MergeSort;

import java.util.Arrays;

public class MergeSort2 {

    public static void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;

        int mid = (low + high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);

        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high){

        int[] temp = new int[high-low+1];

        int left = low;
        int right = mid+1;
        int k=0;

        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }
            else {
                temp[k++] = arr[right++];
            }
        }

        while(right <= high) temp[k++] = arr[right++];
        while(left <= mid) temp[k++] = arr[left++];

        for(int i=0;i<temp.length;i++){
            arr[low+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};

        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
