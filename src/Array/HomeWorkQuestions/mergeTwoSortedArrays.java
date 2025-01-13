package Array.HomeWorkQuestions;

public class mergeTwoSortedArrays {
//    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m
//    and n, representing the number of elements in nums1 and nums2 respectively.

    public static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] mrr = new int[m+n];

        int i = 0, j = 0 , k=0;

        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                mrr[k] = arr1[i];
                i++;k++;
            }
            else if(arr2[j] < arr1[i]){
                mrr[k] = arr2[j];
                j++;k++;
            }
        }
        while(i<m){
            mrr[k] = arr1[i];
            i++;k++;
        }
        while(j<n){
            mrr[k] = arr2[j];
            j++;k++;
        }

        for(int ele:mrr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] a){
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};

        merge(arr1, arr2);
    }
}
