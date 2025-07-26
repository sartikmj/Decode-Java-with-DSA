package BinarySearch.Questions.BinarySearchOnAnswer;


//Leetcode 1011
public class CapacityToShipPackagesWithinDDays {
    public boolean isPossible(int c, int[] arr, int d){
        int n = arr.length;
        int load = 0;
        int days = 1;
        for(int i=0;i<n;i++){
            if(load+arr[i] <= c){
                load+=arr[i];
            }
            else{
                load = arr[i];
                days++;
            }
        }
        if(days>d) return false;
        else return true;

    }

    public int shipWithinDays(int[] arr, int d) {
        //low will be max element of the array and high will be sum of the elements in the array
        //bcz at least you must be able to send each element(low), and you could send all elements at once(high).

        int n = arr.length;
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            sum+=arr[i];
        }
        int low = max, high = sum, minC = sum;
        while(low<=high){ //TC=O(n*log(sum-max)    )
            int mid = low + (high-low)/2;
            if(isPossible(mid,arr,d)==true){
                minC = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return minC;
    }
}
