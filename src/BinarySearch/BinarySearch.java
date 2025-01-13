package BinarySearch;

public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {11,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 23;
        int low = 0;
        int high = arr.length-1;
        boolean flag = false;
        while(low<=high){
//            int mid = (low+high)/2;
            int mid = low + (high-low)/2; // to ensure that low+high doesn't exceed Integer range , use this
            if(arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid] < target) low = mid+1;
            else if(arr[mid] > target) high = mid-1;
        }
        if(flag){
            System.out.println("Target Present");
        }
        else{
            System.out.println("Target Not Present");
        }
    }
}