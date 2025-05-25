package Array.StriverSheet;

public class KandanesAlgorithmMaxSubarray {

    //Optimal Approach --> Kandane's Algorithm
    //if sum gets negative, reduce the sum to 0, and leave that element
    //if the sum is positive, carry that sum forward till the end of the array until it is positive
    //do this all while maintaining maxSum.

//    TC=O(N) SC=O(1)
    public static int maxSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            max = Math.max(max, sum);

            if(sum<0){
                sum=0;
            }
        }
        //in case they say give max sum including empty subarray , i.e. if max sum in array is negative , return 0 as it is the sum of empty subarray []
        if(max<0) return 0;

        return max;
    }

   //HW : print the subarray with maximum sum


    //Brute Force
    public int maxSubArray2(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max = Math.max(sum,max);
            }
        }
        return max;
    }

    //Better Approach
    public int maxSubArray3(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
