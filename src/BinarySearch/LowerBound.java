package BinarySearch;

public class LowerBound {
    //in a sorted array.
    //if x exists in the array than it itself is the lower bound.
    //If x exists more than once then the smallest index will be the lower bound.
    //if not
    //Lower Bound-> Smallest index such that arr[idx]>=x
    //if x is not present and no element in array is >= x then
    //Lower Bound = size of array. i.e, last index + 1.
    //if x is not present and it smaller than the first element then
    //Lower Bound = 0
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140,264};
        int x = 46; //target
        int n = arr.length;
        int low=0;
        int high=n-1;
        int lb = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                lb = Math.min(lb,mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(low);
    }
}
