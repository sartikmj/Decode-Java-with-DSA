package AdvancSortingAlgorithms.MergeSort;

import static AdvancSortingAlgorithms.MergeSort.MergeTwoSortedArrays.print;

public class MergeSort {
    public static void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(j<b.length) c[k++]=b[j++];
        while(i<a.length) c[k++]=a[i++];
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return; //base case
        //make two empty arrays
        int[] a = new int[n/2];
        int[] b = new int[n-n/2]; //bcz array can be of even or odd length

        //copying the elements of the array into the two arrays we made
        for(int i=0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        //magic of recursion
        mergeSort(a);
        mergeSort(b); //merge sort applied on a and b array
        //merge these a and b , that are already sorted arrays
        merge(a,b,arr); //already given array that we broke we will merge and store in it to save space of making a new array.
        //delete a and b to improve Space Complexity
        a = null; b=null;
    }
    public static void main(String[] args){
        int[] arr = new int[]{80,30,50,20,60,10,70,40};
        print(arr);

        mergeSort(arr);
        print(arr);
    }
}
