package SlidingWindow.Questions.Striver;

//Leetcode 1423
public class MaximumPointsYouCanObtainFromCards {

    //Approach -> From Neetcode
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int l = 0,r=n-k;
        int sum=0;
        for(int i=r;i<n;i++){
            sum+=arr[i];
        }
        int ans = sum;
        while(r<n){
            sum+=arr[l];
            sum-=arr[r];
            ans = Math.max(ans,sum);
            l++;r++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
