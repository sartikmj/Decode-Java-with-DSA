package BinarySearch.Questions;

import java.util.Arrays;

public class findFirstAndLastOccurrence {
    //Leetcode 34
    //Find the first and last of occurrence of a target element in a sorted array

    //Approach 1. for first occurence we will find the lower bound of that element
    //2. For last occurrence we will find the upper bound -1 th element of the element

    //return arr{index of first occurrence , index of last occurrence} , if element does'nt exists return ans[-1,-1]
    public static int[] Sol1(int[] arr, int target) {
        int[] ans = {-1,-1};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        boolean flag = false;
        //Basic Binary Search
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
        }
        if(flag == false) return ans;
        //finding lower bound
        low=0;high=n-1;
        int lb=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                lb=Math.min(lb,mid);
                high=mid-1;
            }
            else low=mid+1;
        }
        ans[0]=lb;
        // upper bound
        low=0;high=n-1;
        int ub =n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ub=Math.min(ub,mid);
                high=mid-1;
            }
            else low=mid+1;
        }
        ans[1] = ub-1;
        return ans;
    }

    public static int[] Sol2(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        //first position
        int low = 0,high = n-1;
        int fp=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                if(mid>0 && arr[mid] == arr[mid-1]) high=mid-1;
                else{
                    fp = mid;
                    break;
                }
            }
            else if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
        }

        //last position
        //first position
        low = 0;high = n-1;
        int lp=-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                if (mid + 1 < n && arr[mid] == arr[mid + 1]) low = mid + 1;
                else {
                    lp = mid;
                    break;
                }
            }
            else if (arr[mid] < target) low = mid + 1;
            else if (arr[mid] > target) high = mid - 1;
        }
        ans[0] = fp;
        ans[1]= lp;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(Sol1(arr, target)));
        System.out.println(Arrays.toString(Sol2(arr, target)));
    }
}
