package AdvancSortingAlgorithms.Questions;

//leetcode 493 Hard

public class ReversePair {
    static int count;
    public static void inversions(int[] a, int[] b){
        int i=0,j=0;
        while(i<a.length && j<b.length) {
            if((long)a[i]>(long)2*(long)b[j]) { // typecastin
                count+=(a.length-i);
                j++;
            }
            else{
                i++; //if no inversion is found
            }
        }
    }
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
        //counting the inversions
        inversions(a,b); //after sorting and before merging
        //merge these a and b , that are already sorted arrays
        merge(a,b,arr); //already given array that we broke we will merge and store in it to save space of making a new array.
    }

    public int reversePairs(int[] nums) {
        count=0;
        mergeSort(nums);
        return count;
    }

    public static void main(String[] args) {

    }
}
