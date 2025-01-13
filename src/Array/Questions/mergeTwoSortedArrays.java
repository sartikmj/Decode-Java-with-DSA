package Array.Questions;

public class mergeTwoSortedArrays {
    //Merge two sorted arrays in a single sorted array

    public static void main(String[] args){
        int[] arr = {11,33,42,62};
        int[] brr = {26,54,69,81,94};
        int[] mrr = new int[arr.length+ brr.length];
        int i=0,j=0,k=0; // three pointers for three arrays
        //merging
        while(i<arr.length && j<brr.length){
            if(arr[i]<brr[j]){
                mrr[k] = arr[i];
                i++;
                k++;
            }
            else if(brr[j]<arr[i]){
                mrr[k] = brr[j];
                j++;
                k++;
            }
            else{ // if arr[i]==brr[j]
                mrr[k] = brr[j];
                j++;
                k++;
            }
        }
        //to insert remaining elements of brr
        if(i == arr.length){ //now take elements from brr only
            while(j<brr.length) {
                mrr[k] = brr[j];
                j++;
                k++;
            }
        }
        //to insert remaining elements of arr
        if(j == brr.length){ //now take elements from arr only
            while(i<arr.length){
                mrr[k] = arr[i];
                i++;k++;
            }
        }

        for(int ele : mrr){
            System.out.print(ele+" ");
        }
    }
}
 // HOMEWORK : Do this in taking pointers at the end and coming towards the begining of the array.