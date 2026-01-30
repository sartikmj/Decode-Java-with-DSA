package PrefixSum;

//Leetcode 1991

//Exactly same as Pivot Index question Ques 724
public class FindTheMiddleIndexInArray {

    public int findMiddleIndex(int[] nums) {
        int n = nums.length;

        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }

        int leftSum=0, rightSum=0;
        for(int i=0;i<n;i++){
            if(i>0){
                leftSum= nums[i-1];
            }
            rightSum = nums[n-1] - nums[i];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }

}
