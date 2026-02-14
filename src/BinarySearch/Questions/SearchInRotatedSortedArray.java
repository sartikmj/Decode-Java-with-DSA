package BinarySearch.Questions;

//Leetcode 33
public class SearchInRotatedSortedArray {

    //By Striver

//    1. Identify the sorted half , left half or right half
//    if we compare arr[low] with arr[mid], and found arr[0] > arr[mid] that means left half is not sorted and hence right half is sorted
//    for sure, OR compare the arr[mid] with arr[high], is arr[high] > arr[mid] means right half is sorted and left is not sorted.
//    let's take right half is sorted
//    2. Check is target is a number lie between arr[mid] and arr[n-1], if it is just binary search it.
//    if not then eliminate the right half completely.
//    our target is in the left half, vice versa.
//    keep doing it you will find the target.


    public int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            ;
            if (arr[mid] == target) return mid;

            //left half is sorted
            if (arr[low] <= arr[mid]) {
                //if left half contains the target
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                }
                //else right half contains the target
                else { //if(arr[mid+1]<=target && target<=arr[high])
                    low = mid + 1;
                }
            }
            //right half is sorted
            else {
                //if right half contains the target
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                }
                //else left half contains the target
                else { //arr[low]<=target && target<=arr[mid]
                    high = mid - 1;
                }
            }
        }
        return -1; //if there is no target in array.
    }

    //Solution by Me (BEST FOR ME)
    public int search1(int[] nums, int target) {
        int pivot = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]) pivot = i;
        }

        int p1=0,p2=pivot;
        int p3=pivot+1, p4 = nums.length-1;
        int min1=Integer.MAX_VALUE;
        int low = p1, high = p2;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]>target) high = mid-1;
            else if(nums[mid]<target) low = mid+1;
        }

        low = p3;
        high = p4;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]>target) high = mid-1;
            else if(nums[mid]<target) low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
