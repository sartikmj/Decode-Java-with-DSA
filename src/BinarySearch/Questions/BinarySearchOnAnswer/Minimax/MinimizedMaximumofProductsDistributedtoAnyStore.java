package BinarySearch.Questions.BinarySearchOnAnswer.Minimax;


//Leetcode 2064
public class MinimizedMaximumofProductsDistributedtoAnyStore {

    public boolean isPossible(int maxQty, int n, int[] arr){
        int stores = 0;
        int units = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%maxQty==0) stores+=arr[i]/maxQty;
            else stores+=arr[i]/maxQty +1;
        }
        if(stores>n) return false;
        return true;
    }
    //TC=O(nlog(max))
    public int minimizedMaximum(int n, int[] arr) {
        int m = arr.length, max = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            max = Math.max(max,arr[i]);
        }
        int low = 1, high = max;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(mid,n,arr)){
                ans=mid;
                high = mid - 1;
            }
            else low = mid+1;
        }
        return ans;
    }

}
