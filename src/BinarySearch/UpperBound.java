package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        //Same as Lower Bound just condition changes form arr[mid]>=x to arr[mid]>x
        int[] arr = {10,23,46,46,91,97,97,140,264};
        int n = arr.length;
        int x = 46; // target
        int up=n;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                up = Math.min(mid,up);
                high = mid-1;
            }
            else low = mid+1;
        }
        System.out.println(up);
    }
}
