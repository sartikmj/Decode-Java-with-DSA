package BinarySearch;

public class LowerBound {
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
