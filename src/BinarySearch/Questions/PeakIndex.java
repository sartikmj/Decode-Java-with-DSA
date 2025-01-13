package BinarySearch.Questions;

public class PeakIndex {
    //    You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//    Return the index of the peak element.
//    Your task is to solve it in O(log(n)) time complexity.}
    public static int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=1,high=n-1;
        int peakidx=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                peakidx = mid;
                break;
            }
            else if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else if(arr[mid-1]>arr[mid]){
                high = mid-1;
            }
        }
        return peakidx;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,20,10};
        System.out.println(peakIndexInMountainArray(arr));
    }
}