package PrefixSum;

//Leetcode 238
public class ProductOfArrayExceptSelf {

    //Most Optimized one
    //Using Left Product and Right Product Approach

    public int[] productExceptSelf(int[] nums) {
        int[] leftPro = new int[nums.length];
        int[] rightPro = new int[nums.length];
        int[] res = new int[nums.length];
        int left=1;
        for(int i=0;i<nums.length;i++){
            leftPro[i]=left;
            left*=nums[i];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            rightPro[i]=right;
            right*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            res[i] = leftPro[i]*rightPro[i];
        }
        return res;
    }



    //Using Prefix and Suffix approach

    public int[] productExceptSelf1(int[] nums) {
        //we will use the concept of prefix sum and suffix sum
        //we will make a prefix sum which does not contains the product of the curr ele,
        //but while calculating the curr ele product we will get it by multiplying the
        //  pre[i-1]*arr[i-1]
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0]=1;
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]*nums[i-1];
        }

        suf[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            suf[i] = suf[i+1]*nums[i+1];
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = pre[i]*suf[i];
        }

        return ans;
    }

//    Above approach:
//    Without using extra space

    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];

        pre[0]=1;
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]*nums[i-1];
        }

        int suf = 1;
        for(int i=n-2;i>=0;i--){
            suf *= nums[i+1];
            pre[i] *= (suf);
        }

        return pre;
    }
}
