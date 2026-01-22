package BinarySearch.StriverSheet;

//leetcode 153
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
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

            if(nums[mid]<min1){
                min1 = nums[mid];
                high = mid-1;
            }

            else if(nums[mid]>min1) high = mid-1;
            else if(nums[mid]<min1) low = mid+1;
        }

        low = p3;
        high = p4;
        int min2 = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]<min2){
                min2 = nums[mid];
                high = mid-1;
            }

            else if(nums[mid]>min2) high = mid-1;
            else if(nums[mid]<min2) low = mid+1;
        }

        return Math.min(min1,min2);
    }
}
