package AdvancSortingAlgorithms.Questions;

import java.util.Arrays;

import static AdvancSortingAlgorithms.MergeSort.mergeSort;
//BHAI YE TO BAWAAL HAI :->
public class InversionCount {
//Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).
//What is an inversion of an array? Definition: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].

//    use merge sort algo divide them into single element array
//    now after sorting them , first count the inversions then merge them
//    to count inversion first put i on a and j on b if i > j then all the further elements from a to a.length-1 are greater than j ,
//    count = count + (na-i) , na is the length of a -> a.length

//    THE CODE WILL BE LIKE THIS (SIMILAR TO MERGE SORT CODE)
//    sort(a)
//    sort(b)
//    count inversions in a and b
//    Merge(a,b,arr)
    public static int BruteForce(int[] arr) { //TC = O(n^2) SC = O(1)
        int count=0;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    static int count = 0;

    public static void inversions(int[] a, int[] b){
        int i=0,j=0;
        while(i<a.length && j<b.length) {
            if(a[i]>b[j]) {
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


    public static void main(String[] args) {
        int[] arr = {109,33,89,27,60,10,70};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}

//use this for reverse pair leetcode hard question
